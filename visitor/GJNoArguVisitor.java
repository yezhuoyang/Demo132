//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors with no argument must implement this interface.
 */

public interface GJNoArguVisitor<R> {

   //
   // GJ Auto class visitors with no argument
   //

   public R visit(NodeList n);
   public R visit(NodeListOptional n);
   public R visit(NodeOptional n);
   public R visit(NodeSequence n);
   public R visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( <LBRACE> L() <RBRACE> | <SYSTEM_OUT_PRINTLN> <LPAREN> E() <RPAREN> <SEMICOLON> | <IF> <LPAREN> E() <RPAREN> S() <ELSE> S() | <WHILE> <LPAREN> E() <RPAREN> S() )
    */
   public R visit(S n);

   /**
    * f0 -> ( S() )*
    */
   public R visit(L n);

   /**
    * f0 -> <TRUE>
    *       | <FALSE>
    *       | <NOT> E()
    */
   public R visit(E n);

}

