import java.util.LinkedList;

public class LLDeque<QUASAR> implements Deque<QUASAR> {
  private LinkedList<QUASAR> list = new LinkedList<QUASAR>();


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

    public static void main(String[] args) {
      LLDeque LL = new LLDeque();
      LL.addFirst(1);
      LL.addFirst(2);
      LL.addFirst(3);
      System.out.println("filled LL: " + LL);
      LL.removeLast();
      System.out.println("removed head: " + LL);
      System.out.println("Peekin at new head: " + LL.peekFirst());
    }

}//end class
