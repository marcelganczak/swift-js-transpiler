import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Initializer {

    static public String handleClassBody(ParseTree ctx, Visitor visitor) {

        NestedByIndexType classDefinition = (NestedByIndexType)visitor.cache.getClassDefinition(ctx).object.type;

        LinkedHashMap<String, AbstractType> initializers = Initializer.initializers(classDefinition);
        String constructorCode = "constructor(signature: string, ...params: any[]) {\n";
        for(Map.Entry<String, AbstractType> entry : initializers.entrySet()) {
            constructorCode += "if(signature === '" + entry.getKey().substring(4) + "') return this." + entry.getKey() + ".apply(this, params);\n";
        }
        constructorCode += "}\n";

        String memberwiseInitializerCode = "";
        if(classDefinition.memberwiseInitializer != null) {
            FunctionType memberwiseInitializer = (FunctionType)classDefinition.hash.get(classDefinition.memberwiseInitializer);
            memberwiseInitializerCode += classDefinition.memberwiseInitializer + "(";
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

    static private LinkedHashMap<String, AbstractType> initializers(NestedByIndexType classDefinition) {
        LinkedHashMap<String, AbstractType> initializers = new LinkedHashMap<String, AbstractType>();
        for(Map.Entry<String, AbstractType> entry : classDefinition.hash.entrySet()) {
            if(entry.getKey().startsWith("init$") || entry.getKey().equals("init")) {
                initializers.put(entry.getKey(), entry.getValue());
            }
        }
        return initializers;
    }

    static public void addMemberwiseInitializer(NestedByIndexType classDefinition) {
        if(!initializers(classDefinition).isEmpty()) return;

        String nameAugment = "";
        ArrayList<String> parameterNames = new ArrayList<String>();
        ArrayList<AbstractType> parameterTypes = new ArrayList<AbstractType>();
        for(Map.Entry<String, AbstractType> entry : classDefinition.hash.entrySet()) {
            if(entry.getValue() instanceof FunctionType) continue;
            nameAugment += "$" + entry.getKey() + "_" + entry.getValue().swiftType();
            parameterNames.add(entry.getKey());
            parameterTypes.add(entry.getValue());
        }

        if(!parameterNames.isEmpty()) {
            classDefinition.hash.put("init" + nameAugment, new FunctionType(parameterNames, parameterTypes, 0, new BasicType("Void"), null));
            classDefinition.memberwiseInitializer = "init" + nameAugment;
        }
    }
}
