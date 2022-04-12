// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW89: Queue Two Ways
// 2022-04-11
// time spent: 0.5 hrs

/*
DISCO:
- the difference between linked list and arraylist queues is that LL uses peek()
and addLast() for peekFront whereas AL uses get() and add(), respectively.

QCC:
- which is faster? AL or LL?
*/

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

    public String toString() {
      String foo = "[";
      if (!list.isEmpty()) {
        for (int i = 0; i < list.size() - 1; i++) {
          foo += list.get(i) + ", ";
        }
        foo += list.get(list.size() - 1);
      }
      foo += "]";
      return foo;
    }

    public static void main(String[] args) {
      LLQueue Leon = new LLQueue();
      System.out.println("Is Leon empty? " + Leon.isEmpty());
      Leon.enqueue(1);
      Leon.enqueue(2);
      Leon.enqueue(3);
      System.out.println("Leon enqueued: " + Leon);
      System.out.println("Is Leon empty? " + Leon.isEmpty());
      Leon.dequeue();
      Leon.dequeue();
      Leon.dequeue();
      System.out.println("Leon dequeued: " + Leon);
      System.out.println("Is Leon empty? " + Leon.isEmpty());
    }
}
