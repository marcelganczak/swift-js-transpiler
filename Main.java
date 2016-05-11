import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static void main(String [] args) {

        String srcFile = args.length > 0 ? args[0] : "./example.swift";

        StringInterpolation.breakUp(srcFile);

        ANTLRFileStream inputFile = null;

        try {
            inputFile = new ANTLRFileStream("./broke-up-string-interpolation.swift");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SwiftLexer lexer = new SwiftLexer(inputFile);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SwiftParser parser = new SwiftParser(tokens);
        SwiftParser.Top_levelContext tree = parser.top_level();

        EntityCache cache = new EntityCache();

        CacheVisitor cacheVisitor = new CacheVisitor(cache);
        cacheVisitor.visit(tree);

        TranspilerVisitor transpilerVisitor = new TranspilerVisitor(cache);
        System.out.println(transpilerVisitor.visit(tree));
    }


}
