import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Initializer {

    static public String handleClassBody(ParseTree ctx, Visitor visitor) {

        ClassDefinition classDefinition = (ClassDefinition)visitor.cache.getClassDefinition(ctx).object;

        LinkedHashMap<String, Instance> initializers = Initializer.initializers(classDefinition);
        String memberwiseInitializerSignature = null;
        String constructorCode = "constructor(signature: string, ...params: any[]) {\n";
        if(classDefinition.superClass != null) constructorCode += "super(null);\n";
        for(Map.Entry<String, Instance> entry : initializers.entrySet()) {
            constructorCode += "if(signature === '" + entry.getKey().substring(4) + "') return this." + entry.getKey() + ".apply(this, params);\n";
            if(entry.getValue().isMemberwiseInitializer) memberwiseInitializerSignature = entry.getKey();
        }
        constructorCode += "}\n";

        String memberwiseInitializerCode = "";
        if(memberwiseInitializerSignature != null) {
            FunctionDefinition memberwiseInitializer = (FunctionDefinition)classDefinition.properties.get(memberwiseInitializerSignature).definition;
            memberwiseInitializerCode += memberwiseInitializerSignature + "(";
            for(int i = 0; i < memberwiseInitializer.parameterExternalNames.size(); i++) {
                memberwiseInitializerCode +=
                    (i > 0 ? ", " : "") + memberwiseInitializer.parameterExternalNames.get(i) +
                    ": " + memberwiseInitializer.parameterTypes.get(i).targetType(visitor.targetLanguage);
            }
            memberwiseInitializerCode += "): void {\n";
            for(int i = 0; i < memberwiseInitializer.parameterExternalNames.size(); i++) {
                memberwiseInitializerCode += "this." + memberwiseInitializer.parameterExternalNames.get(i) + " = " + memberwiseInitializer.parameterExternalNames.get(i) + ";\n";
            }
            memberwiseInitializerCode += "}\n";
        }

        SwiftParser.DeclarationsContext declarations =
            ctx instanceof SwiftParser.Class_bodyContext ? ((SwiftParser.Class_bodyContext)ctx).declarations() :
            ((SwiftParser.Struct_bodyContext)ctx).declarations();
        return "{\n" + visitor.visit(declarations) + memberwiseInitializerCode + constructorCode + "}";
    }

    static private LinkedHashMap<String, Instance> initializers(ClassDefinition classDefinition) {
        LinkedHashMap<String, Instance> initializers = new LinkedHashMap<String, Instance>();
        for(Map.Entry<String, Instance> entry : classDefinition.properties.entrySet()) {
            if(entry.getValue().isInitializer) {
                initializers.put(entry.getKey(), entry.getValue());
            }
        }
        return initializers;
    }

    static public void addMemberwiseInitializer(ClassDefinition classDefinition) {
        if(!initializers(classDefinition).isEmpty()) return;

        String nameAugment = "";
        ArrayList<String> parameterNames = new ArrayList<String>();
        ArrayList<Instance> parameterTypes = new ArrayList<Instance>();
        for(Map.Entry<String, Instance> entry : classDefinition.properties.entrySet()) {
            if(entry.getValue().isMethod) continue;
            nameAugment += "$" + entry.getKey() + "_" + entry.getValue().typeName.uniqueId();
            parameterNames.add(entry.getKey());
            parameterTypes.add(entry.getValue());
        }

        if(!parameterNames.isEmpty()) {
            FunctionDefinition function = new FunctionDefinition(null, parameterNames, parameterTypes, 0, new Instance("Void"), null);
            Instance initializer = new Instance(function);
            initializer.isMethod = initializer.isInitializer = initializer.isMemberwiseInitializer = true;
            classDefinition.properties.put("init" + nameAugment, initializer);
        }
    }

    static public String handleReturnStatement(SwiftParser.Return_statementContext ctx, Visitor visitor) {
        if(!WalkerUtil.isDirectDescendant(SwiftParser.Nil_literalContext.class, ctx.expression())) return visitor.visitChildren(ctx);

        ParseTree containingBlock = visitor.cache.findNearestAncestorFunctionBlock(ctx);
        if(containingBlock instanceof SwiftParser.Initializer_bodyContext) {
            return "return (this.$failed = true)";
        }

        return visitor.visitChildren(ctx);
    }

    static public boolean isFailable(PrefixElem elem) {
        //BODGE: we're retrieving the initializerSignature (i.e. what argument names/types it's using)
        //by slicing the functionCallParams string (i.e. "$quantity_Int", 2 --> $quantity_Int)
        //that's the simplest way of getting what we want for now, but it'd be better if the signature was passed somehow
        String initializerSignature = elem.functionCallParams.substring(1, elem.functionCallParams.indexOf('"', 1));
        FunctionType initializer = (FunctionType)((NestedByIndexType) elem.type).hash.get("init" + initializerSignature);
        return initializer != null && initializer.isFailableInitializer;
    }
}
