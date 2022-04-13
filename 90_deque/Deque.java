/***
 * interface Deque
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Deque<QUASAR>
{
  public void addLast(QUASAR x);

  public QUASAR removeFirst();

  public QUASAR peekFirst();

  public void addFirst(QUASAR x);

  public QUASAR removeLast();

  public QUASAR peekLast();


}//end interface Deque
