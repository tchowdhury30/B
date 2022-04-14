// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW90: Deque the Halls
// 2022-04-13
// time spent: 0.5 hrs

import java.util.LinkedList;

public class AcidicDeque<QUASAR> implements Deque<QUASAR> {
  private LinkedList<QUASAR> list;

  public void addLast(QUASAR x)
  {
    list.addLast(x);
  }

  public QUASAR removeFirst()
  {
    return list.removeFirst();
  }

  public QUASAR peekFirst()
  {
    return list.peekFirst();
  }

  public void addFirst(QUASAR x)
  {
    list.addFirst(x);
  }

  public QUASAR removeLast()
  {
    return list.removeLast();
  }

  public QUASAR peekLast()
  {
    return list.peekLast();
  }

  public boolean offerLast(QUASAR x)
  {
    return list.offer(x);
  }

  public boolean offerFirst(QUASAR x)
  {
    return list.offerFirst(x);
  }

  public QUASAR getFirst()
  {
    return list.element();
  }

  public QUASAR getLast()
  {
    return list.getLast();
  }

  public QUASAR pollFirst()
  {
    return list.poll();
  }

  public QUASAR pollLast()
  {
    return list.pollLast();
  }

    //Stringification
    public String toString() {
      String foo = "[";
      if (list.size() != 0) {
        for (int i = 0; i < list.size() - 1; i++) {
          foo += list.get(i) + ", ";
        }
        foo += list.get(list.size() - 1);
      }
      foo += "]";
      return foo;
    }

}//end class
