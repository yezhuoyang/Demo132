//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All void visitors must implement this interface.
 */

public interface Visitor {

   //
   // void Auto class visitors
   //

   public void visit(NodeList n);
   public void visit(NodeListOptional n);
   public void visit(NodeOptional n);
   public void visit(NodeSequence n);
   public void visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( <LBRACE> L() <RBRACE> | <SYSTEM_OUT_PRINTLN> <LPAREN> E() <RPAREN> <SEMICOLON> | <IF> <LPAREN> E() <RPAREN> S() <ELSE> S() | <WHILE> <LPAREN> E() <RPAREN> S() )
    */
   public void visit(S n);

   /**
    * f0 -> ( S() )*
    */
   public void visit(L n);

   /**
    * f0 -> <TRUE>
    *       | <FALSE>
    *       | <NOT> E()
    */
   public void visit(E n);

}

