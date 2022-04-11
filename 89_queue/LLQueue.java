// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW89: Queue Two Ways
// 2022-04-11
// time spent: 0.5 hrs

import java.util.LinkedList;

public class LLQueue<QUASAR> implements Queue<QUASAR> {
  private LinkedList<QUASAR> list;

    public LLQueue()
    {
      list = new LinkedList<QUASAR>();
    }
    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.
    public QUASAR dequeue()
    {
      return list.remove();
    }

    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.
    public void enqueue( QUASAR x )
    {
      list.addLast(x);
    }

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty()
    {
      return list.isEmpty();
    }

    //Returns the first element of the queue without dequeuing it.
    public QUASAR peekFront()
    {
      return list.peek();
    }


}
