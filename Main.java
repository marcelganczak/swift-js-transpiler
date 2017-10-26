import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {

    public static void main(String [] args) {

        String srcFile = args.length > 0 ? args[0] : "./example.swift";
        String targetLanguage = args.length > 1 ? args[1] : "ts";

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

        Cache cache = new Cache();

        TypeLoader.load(cache, tree);
        OperatorLoader.load(cache, tree);

        CacheVisitor cacheVisitor = new CacheVisitor(cache, targetLanguage);
        cacheVisitor.visit(tree);

        TranspilerVisitor transpilerVisitor = new TranspilerVisitor(cache, targetLanguage);
        System.out.println(transpilerVisitor.visit(tree));
    }


}
