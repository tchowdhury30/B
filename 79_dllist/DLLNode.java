/***
 * class DLLNode v1
 * Implements a node, for use in lists and other container classes.
 * Stores a String as cargo.
 **/

public class DLLNode
{
  private String _cargo;    //cargo may only be of type String
  private DLLNode _nextNode, _prevNode; //pointers to next, prev DLLNodes


  // constructor -- initializes instance vars
  public DLLNode( String value, DLLNode prev, DLLNode next )
  {
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo() { return _cargo; }

  public DLLNode getNext() { return _nextNode; }

  public DLLNode getPrev() { return _prevNode; }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    String foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode setNext( DLLNode newNext )
  {
    DLLNode foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public DLLNode setPrev( DLLNode newPrev )
  {
    DLLNode foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString() { return _cargo.toString(); }


  //main method for testing
  public static void main( String[] args )
  {
    //Below is an exercise in creating a linked list...

 /*********************
    //Create a node
    DLLNode first = new DLLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new DLLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new DLLNode( "cow", null ) );

    DLLNode temp = first;
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
    }
   ***********************/
  }//end main

}//end class DLLNode
