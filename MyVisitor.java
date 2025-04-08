// File: MyVisitor.java
import visitor.DepthFirstVisitor;
import syntaxtree.*; // or wherever JTB put your AST node classes

/**
 * A custom visitor that extends DepthFirstVisitor,
 * which visits each node in a depth-first manner.
 */
public class MyVisitor extends DepthFirstVisitor {
    
    @Override
    public void visit(S n) {
        System.out.println("Visiting an S node");
        // Optionally do something custom with n
        // Then be sure to visit children
        super.visit(n);
    }
    
    @Override
    public void visit(E n) {
        System.out.println("Visiting an E node");
        super.visit(n);
    }
    
    @Override
    public void visit(L n) {
        System.out.println("Visiting an L node");
        super.visit(n);
    }
    
    // You can override more visit methods if needed...
}