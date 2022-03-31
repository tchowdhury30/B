import java.util.LinkedList;

public class LLStack<T> implements Stack<T> {
  private LinkedList<T> list;

  public LLStack() {
    list = new LinkedList<T>();
  }

  public T peekTop() {
    return list.getLast();
  }

  public boolean isEmpty() {
    return list.size() < 1;
  }


  public void push(T x) {
    list.addLast(x);
  }

  public T pop() {
    return list.removeLast();
  }


}
