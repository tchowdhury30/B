import java.util.*;

public class ArrayPriorityQueue implements PriorityQueue<Integer> {
  private ArrayList<Integer> diana;

  public ArrayPriorityQueue() {
    diana = new ArrayList<Integer>();
  }

  //O(n)
  public void add(Integer foo) {
    if (diana.isEmpty()){
      diana.add(foo);
    }
    for (int i = diana.size() - 1; i >= 0; i--) {
      if (((Comparable)foo).compareTo(diana.get(i)) > 0) {
        diana.add(i, foo);
        return;
      }
      else {
        diana.add(0, foo);
        return;
      }
    }
  }

  //O(1)
  public boolean isEmpty() {
    return (diana.size() == 0);
  }

  //O(1)
  public Integer peekMin() {
    return diana.get(0);
  }

  //O(1)
  public Integer removeMin() {
    return diana.remove(0);
  }

  public String toString() {
    String ret = "";
    if (diana.isEmpty()) {
      return ret;
    }
    else {
      for (Integer i : diana) {
        ret += i.toString() + ", ";
      }
    }
    return ret;
  }

  public static void main(String[] args) {
    ArrayPriorityQueue tasnim = new ArrayPriorityQueue();
    System.out.println("Here is Tasnim at birth: " + tasnim);
    System.out.println("Is she empty? " + tasnim.isEmpty());
    if (tasnim.isEmpty())
      System.out.println("feed me Faiza");
    tasnim.add(6);
    tasnim.add(4);
    tasnim.add(6);
    tasnim.add(5);
    tasnim.add(2);
    tasnim.add(7);
    System.out.println("Here is Tasnim now: " + tasnim);
    System.out.println("Has Faiza fed her? " + tasnim.isEmpty());
    System.out.println("What did Tasnim have for breakfast? " + tasnim.peekMin());
    System.out.println("Now we will remove it. " + tasnim.removeMin());
    System.out.println("Here is Tasnim after the surgery: " + tasnim);

    System.out.println("\nNow we will examine Faiza");

    ArrayPriorityQueue faiza = new ArrayPriorityQueue();
    System.out.println("Here is Faiza in her current state: " + faiza);
    System.out.println("Is she unfilled? " + faiza.isEmpty());
    if (faiza.isEmpty())
      System.out.println("feed me Faiza");
    faiza.add(00);
    faiza.add(000000);
    faiza.add(000000000000);
    faiza.add(-911);
    faiza.add(251);
    faiza.add(20050812);
    System.out.println("Here is Faiza's future: " + faiza);
    System.out.println("Will Faiza pass Calc BC? " + faiza.isEmpty());
    System.out.println("What did Faiza do to fail? " + faiza.peekMin());
    System.out.println("Now we will teach her good study habits. " + faiza.removeMin());
    System.out.println("Here is Faiza after proper intervention: " + faiza);
  }
}
