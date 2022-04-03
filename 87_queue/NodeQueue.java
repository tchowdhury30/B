/*
Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
APCS pd08
HW87: The English Do Not Wait In Line for Soup
2022-04-04
time spent: 0.5 hrs

  DISCO
  - We could use an inner class with all the LLNode methods
  - _head and _tail are confusing variable names for stacks so we went for _front and _back instead
  QCC
  - What are types of queues are there?

*/

public class NodeQueue<QUASAR> implements Queue<QUASAR> {

  LLNode<QUASAR> _front;
  LLNode<QUASAR> _back;
  int size;

  public NodeQueue() {
    _front = null;
    _back = null;
    size = 0;
  }

  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue() {
    LLNode<QUASAR> d = _front;
    _front = _front.getNext();
    size--;
    return d.getCargo();
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ) {
    LLNode<QUASAR> e = new LLNode<QUASAR>(x, null);
    if (isEmpty()) {
      _front = e;
      _back = e;
    } else {
      _back.setNext(e);
      _back = e;
    }
    size++;
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty() {
    return (size < 1);
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront() {
    return _front.getCargo();
  }
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

  private class LLNode<QUASAR> {
    //instance vars
    private QUASAR _cargo;
    private LLNode _nextNode;

    // constructor
    public LLNode( QUASAR value, LLNode next )
    {
      _cargo = value;
      _nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public QUASAR getCargo()
    {
      return _cargo;
    }

    public LLNode getNext()
    {
      return _nextNode;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public QUASAR setCargo( QUASAR newCargo )
    {
      QUASAR foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public LLNode setNext( LLNode newNext )
    {
      LLNode foo = getNext();
      _nextNode = newNext;
      return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString()
    {
      return _cargo.toString();
    }

  } //end LLNode class

  public static void main(String[] args) {
    NodeQueue<String> test = new NodeQueue<String>();
    test.enqueue("Well");
    test.enqueue("um");
    test.enqueue("yes!");
    System.out.println(test.dequeue());
    System.out.println(test.dequeue());
    System.out.println(test.dequeue());


  }



} // end NodeQueue class
