import java.io.FileInputStream;
import java.io.InputStream;
import syntaxtree.S;     // or wherever JTB placed your S node
import syntaxtree.Node; // or Node is a supertype if you prefer
import visitor.*;        // for Visitor interfaces
import java.io.IOException;
import tiniJavaParser.tiniJavaParser;



public class demo {
    public static void main(String[] args) {
        try {
            // 1) Pick an input source
            InputStream in;
            if (args.length > 0) {
                // If a file name is passed, parse that file
                in = new FileInputStream(args[0]);
                System.out.println("Parsing from file: " + args[0]);
            } else {
                // Otherwise parse from standard input
                in = System.in;
                System.out.println("Parsing from standard input");
            }

            // 2) Create the parser on that input
            tiniJavaParser parser = new tiniJavaParser(in);

            // 3) Parse the top-level nonterminal S()
            //    S is the root AST node type for your grammar
            S rootnode=parser.S();
            System.out.println("Parse successful!");
            
            // 4) Create and run a custom visitor
            MyVisitor visitor = new MyVisitor();
            rootnode.accept(visitor);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
