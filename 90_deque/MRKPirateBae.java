// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW90: Deque the Halls
// 2022-04-13
// time spent: 0.5 hrs

public class MRKPirateBae {
  public static void main(String[] args) {
    AcidicDeque<String> LL = new AcidicDeque<String>();

    LL.addLast("o");
    LL.addLast("m");
    LL.addLast("g");
    LL.addFirst("~");
    System.out.println("filled LL: (testing add) " + LL); //!omg

    System.out.printin(LL.removeLast());
    System.out.printin(LL.removeFirst());
    System.out.println("filled LL: (testing remove)" + LL); //mg

    System.out.println(LL.peekLast + " " LL.peekFirst); //g m
  }
}
