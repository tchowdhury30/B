/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. ...
 *   5. Profit!
 *
 * STACK OF CHOICE: ____ by ____
 * b/c ...
 **/
import java.util.ArrayList;

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/


  public static String evaluate( String expr )
  {
    ALStack<String> par = new ALStack<String>();
    ALStack<String> ops = new ALStack<String>();
    String[] expres = expr.split(" ");
    int val = 0;
    for (int i = 0; i < expres.length; i++){
      if (!expres[i].equals("*") &&
          !expres[i].equals("+") &&
          !expres[i].equals("-")
          ) //checks that expres[i] is NOT operand
      {
        par.push(expres[i]);
        if (expres[i].equals(")")) //encounter closer
        {
          String currentOp = ops.peekTop();
          System.out.println("currentOP!" + currentOp);
          par.pop(); //pop that mf!
          //now pop until u reach the opener
          while (!par.peekTop().equals("(")) {
            int p = Integer.parseInt(par.pop());
            if (currentOp.equals("+")) {
              val += p;
              System.out.println(val);
            } //adding
            else if (currentOp.equals("-")) {
              val = p - Integer.parseInt(par.peekTop());
              System.out.println(val);
            } //subtracting
            else if (currentOp.equals("*")) {
              val = p * Integer.parseInt(par.peekTop());
              System.out.println(val);
            } //multiplying
          }//ends while popper loop
          if (par.peekTop().equals("(")) {
            par.pop();
          }
          ops.pop();
          par.push(Integer.toString(val));
        } //ends for closer checker
      } //ends if that checks for NOT operand
      else if (expres[i].equals("*") ||
              expres[i].equals("+") ||
              expres[i].equals("-")
              )
      {
        ops.push(expres[i]); //push into ops if u encounter an operator
        // System.out.println("top of ops " + ops.peekTop());
      }
    } //end for loop
    return (Integer.toString(val));
  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  // public static String unload( int op, Stack<String> numbers )
  // {
  //
  // }//end unload()


  /*
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
  }
  catch( NumberFormatException e ) {
  return false;
  }
  }
  */


  //main method for testing
  public static void main( String[] args )
  {

      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
