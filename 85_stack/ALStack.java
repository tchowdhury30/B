import java.util.ArrayList;

public class ALStack<T> implements Stack<T> {
  private ArrayList<T> list;

  public ALStack() {
    list = new ArrayList<T>();
  }

  public T peekTop() {
    return list.get(list.size()-1);
  }

  public boolean isEmpty() {
    return list.size() < 1;
  }

  public void push(T s) {
    list.add(s);
  }

  public T pop() {
    T old = peekTop();
    list.remove(list.size()-1);
    return old;
  }

  
}
