// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW78: Double Up
// 2022-03-16
// time spent: 0.5 hrs

/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a T
 *****************************************************/

public class DLLNode 
{
    //instance vars
    private _cargo<T> _cargo = new _cargo<T>();    //cargo may only be of type T
    private DLLNode _nextNode; //pointer to next LLNode
    private DLLNode _previousNode; //pointer to previous LLNode

    // constructor -- initializes instance vars
    public DLLNode( T value, DLLNode next, DLLNode prev) {
	      _cargo = value;
	      _nextNode = next;
        _previousNode = prev;
    }

    public DLLNode(T value, DLLNode next) {
      _previousNode = null;
      _cargo = value;
      _nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public T getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }

    public DLLNode getPrev() { return _previousNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo ) {
      T foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public DLLNode setNext( DLLNode newNext ) {
	     DLLNode foo = getNext();
	     _nextNode = newNext;
       return foo;
    }

    public DLLNode setPrev( DLLNode newPrev ) {
      DLLNode foo = getPrev();
      _previousNode = newPrev;
      return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args )
    {

    }//end main

}//end class LLNode
