/***
 * class Latkes
 * v1
 * Implements a stack of Strings using an encapsulated array
 **/

public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stack = new String[initCapacity];
    _stackSize = 0;
  }


  //means of insertion
  public void push( String s )
  {
    //if necessary, create more storage space
    if ( isFull() ) {
      String[] temp = new String[ _stack.length * 2 ];
      for( int i = 0; i < _stack.length; i++ ) {
        temp[i] = _stack[i];
      }
      _stack = temp; //old _stack freed by JGC
    }
    //add new element at end of array
    //Q: Why is this more efficient than inserting at front?
    _stack[_stackSize] = s;
    _stackSize++;
  }


  //means of removal
  public String pop()
  {
    String retStr = "";
    if ( isEmpty() )  return null;
    retStr = _stack[ _stackSize---1 ];
    return retStr;
  }


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }

  //chk for fullness
  public boolean isFull()
  {
    return _stackSize >= _stack.length;
  }

  public int getSize()
  {
    return this._stackSize;
  }


  //main method for testing
  public static void main( String[] args )
  {
    Latkes tastyStack = new Latkes(10);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
