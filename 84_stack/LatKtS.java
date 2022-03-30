// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW84: Stack: What Is It Good For?
// 2022-03-29
// time spent: 0.5 hrs

/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.

 DISCO
 Need to put the open brackets in a stack and iteratre through every closed bracket and check if the
 stack[size] with the open brackets matches the closed bracket the current iteration is it. If it does,
 pop the stack and iteriate, if not return false.

 QCC

 **/

public class LatKtS
{
  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes reversed = new Latkes(10 );

    for (String chr : s.split("") ) {
      reversed.push(chr);
    }
    int size = reversed.getSize();
    String ans = "";

    for (int i=0; i < size; i++) {
      ans += reversed.pop();
    }
    return ans;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    //index positions of openings and closings must match
    final String open = "{[(";
    final String closed = "}])";
    
    Latkes opened = new Latkes( s.length() );
    // all opens go into stack "opened"
    for (int i =0; i < s.length(); i++)
    {
      String pos = s.substring(i, i+1);
      if ( open.indexOf(pos) > -1) {
        opened.push(pos); }

    // closed are compared with the stack
    else
      {
      if ( opened.isEmpty() || closed.indexOf(pos) != open.indexOf(opened.pop() ) ) {
        return false; }
      }
    }
    return opened.isEmpty();
    //cannot be 'return true' or else it misses out when there is an open bracket w/o closing
  }


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
  }

}//end class
