//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors must implement this interface.
 */

public interface GJVisitor<R,A> {

   //
   // GJ Auto class visitors
   //

   public R visit(NodeList n, A argu);
   public R visit(NodeListOptional n, A argu);
   public R visit(NodeOptional n, A argu);
   public R visit(NodeSequence n, A argu);
   public R visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( <LBRACE> L() <RBRACE> | <SYSTEM_OUT_PRINTLN> <LPAREN> E() <RPAREN> <SEMICOLON> | <IF> <LPAREN> E() <RPAREN> S() <ELSE> S() | <WHILE> <LPAREN> E() <RPAREN> S() )
    */
   public R visit(S n, A argu);

   /**
    * f0 -> ( S() )*
    */
   public R visit(L n, A argu);

   /**
    * f0 -> <TRUE>
    *       | <FALSE>
    *       | <NOT> E()
    */
   public R visit(E n, A argu);

}
