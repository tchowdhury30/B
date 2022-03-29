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

 QCC

 **/

public class LatKtS
{
  private static Latkes reversed = new Latkes(10 );
  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    String ans = "";
    for (String chr : s.split("") ) {
      reversed.push(chr);
    }
    int size = reversed.getSize();
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
    ans = new Latkes(10);
    for (String chr : s.split(" ")) {
      if (chr.equals("(") || chr.equals("[") || chr.equals("{")) {
        ans.push(chr);
      }
    }
  }


  //main method to test
  public static void main( String[] args )
  {
/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    System.out.println(flip("stressed"));

    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
