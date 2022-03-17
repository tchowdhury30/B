// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW78: Double Up
// 2022-03-16
// time spent: 0.5 hrs

/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class DLLNode
{
    //instance vars
    private String _cargo;    //cargo may only be of type String
    private LLNode _nextNode; //pointer to next LLNode
    private LLNode _previousNode; //pointer to previous LLNode

    // constructor -- initializes instance vars
    public DLLNode( String value, LLNode next, LLNode prev) {
	      _cargo = value;
	      _nextNode = next;
        _previousNode = prev;
    }

    public DLLNode(String value, DLLNode next) {
      _previousNode = null;
      _cargo = value;
      _nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public LLNode getNext() { return _nextNode; }

    public LLNode getPrev() { return _previousNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) {
      String foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public LLNode setNext( LLNode newNext ) {
	     LLNode foo = getNext();
	     _nextNode = newNext;
       return foo;
    }

    public LLNode setPrev( LLNode newPrev ) {
      LLnode foo = getPrev();
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
