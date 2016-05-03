import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static void main(String [] args) {

        ANTLRFileStream inputFile = null;

        try {
            inputFile = new ANTLRFileStream(args.length > 0 ? args[0] : "./example.swift");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SwiftLexer lexer = new SwiftLexer(inputFile);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SwiftParser parser = new SwiftParser(tokens);
        SwiftParser.Top_levelContext tree = parser.top_level();

        SwiftBaseVisitor visitor = new Visitor();
        System.out.println(visitor.visit(tree));

        //MyListener extractor = new MyListener();
        //ParseTreeWalker.DEFAULT.walk(extractor, tree);

        //System.out.println(printTree(tree));
    }


}
