// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW80 Generically Speaking
// 2022-03-23
// time spent: 0.5 hrs

public class DLLNode<T>
{
    //instance vars
    private T _cargo;
    private DLLNode<T> _nextNode; //pointer to next LLNode
    private DLLNode<T> _previousNode; //pointer to previous LLNode

    // constructor -- initializes instance vars
    public DLLNode( T value, DLLNode<T> next, DLLNode<T> prev) {
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

    public DLLNode<T> getNext() { return _nextNode; }

    public DLLNode<T> getPrev() { return _previousNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo ) {
      T foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public DLLNode<T> setNext( DLLNode<T> newNext ) {
	     DLLNode<T> foo = getNext();
	     _nextNode = newNext;
       return foo;
    }

    public DLLNode<T> setPrev( DLLNode<T> newPrev ) {
      DLLNode<T> foo = getPrev();
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
