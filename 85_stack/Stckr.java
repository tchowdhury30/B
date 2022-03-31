/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<Object> cakes = new ALStack<Object>();
    //Stack<Z> cakes = new LLStack<Z>();

    System.out.println()
    cakes.push(false);
    cakes.push("wooow");
    cakes.push(9.0);

    for (int i = 5; i < 15; i++) {
        cakes.push(i);
        System.out.println(cakes.peekTop());
    }

    while (!cakes.isEmpty()) {
      System.out.println(cakes.peekTop());
	    System.out.println(cakes.pop());
    }

  }//end main

}//end class
