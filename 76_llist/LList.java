// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW76: We Got a Little Ol' Convoy
// 2022-03-14
// time spent: 0.5 hrs

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;
  private List<String> list;

  // constructor -- initializes instance vars
  public LList( )
  {
    // YOUR CODE HERE
    list = new LinkedList<String>();
    _head = new LLNode(null,null);
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    // YOUR CODE HERE
    _head.setCargo(newVal);
    size += 1;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    // YOUR CODE HERE
    String stuff = _head.getCargo();
    return stuff;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // YOUR CODE HERE
    head.get(index)
  }


  //return number of nodes in list
  public int size()
  {
    // YOUR CODE HERE
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    // YOUR CODE HERE
    return _cargo;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LLists
