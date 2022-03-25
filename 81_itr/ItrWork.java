// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW81 Thank You, Next
// 2022-03-24
// time spent: 0.5 hrs

/***
 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators
 **/

/***
    DISCO

    QCC
    Why do we have to typecast to Integer from int instead of just using Integer from the start?

    SUMMARY THE FIRST:
    Interface Iterator is a set of methods used to get an element from a collection (set, list, map)
    But it is useful in that it can get words one at a time from a file or URL.
    Its methods are hasNext(), next(), remove()

    SUMMARY THE SECOND:

**/




import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    for (int elem : L)
    {
      if (elem == key) {
        return true; }
    }
    return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    Iterator it = L.iterator();
    while (it.hasNext()) {
      int elem = (Integer) it.next();
      if (elem == key) {
        return true;
      }
    }
    return false;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (int elem : L)
    {
      if (elem%2 == 1) {
        ans.add(elem);
      }
    }
    return ans;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    ArrayList<Integer> ans = new ArrayList<Integer>();
    Iterator it = L.iterator();
    while (it.hasNext()) {
      int num = (int)it.next();
      if (num%2 == 1) {
        ans.add(num);
      }
    }
    return ans;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    Iterator it = L.iterator();
    while (it.hasNext()) {
      if ((int)it.next() %2 == 0) {
        it.remove();
      }
    }
  }


  public static void main( String [] args )
  {


    //var type: List   obj type: ?
    List<Integer> L = new ArrayList<Integer>();

    for( int i = 0; i < 10; i++ )
      L.add(i);


    // TASK: write code to print the contents of L...

    // a) using a FOREACH loop
    for( int i = 0; i < L.size(); i++){
      System.out.print(i);
      if(i < L.size() -1 ) System.out.print(", ");
    }


    // b) explicitly using an iterator
    Iterator<Integer> it = L.iterator();
    while(it.hasNext()){
      System.out.print(it.next()+" ");
    }
    System.out.print("\n");


    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );

    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );

    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);

    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);

    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
    /*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class ItrWork
