// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW89: Queue Two Ways
// 2022-04-11
// time spent: 0.5 hrs

import java.util.ArrayList;

public class ALQueue<QUASAR> implements Queue<QUASAR> {
  private ArrayList<QUASAR> list;

  public ALQueue()
  {
    list = new ArrayList<QUASAR>();
  }
    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.
    public QUASAR dequeue()
    {
      return list.remove(0);
    }

    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.
    public void enqueue( QUASAR x )
    {
      list.add(x);
    }

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty()
    {
      return list.isEmpty();
    }

    //Returns the first element of the queue without dequeuing it.
    public QUASAR peekFront()
    {
      return list.get(0);
    }


}
