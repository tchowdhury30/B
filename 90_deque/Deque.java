// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW90: Deque the Halls
// 2022-04-13
// time spent: 0.5 hrs

/*
DISCO:
- very similar to last night
QCC:
- what is advantage of limited capacity deque?
*/

/***
 * interface Deque
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Deque<QUASAR>
{
  /*
  Inserts the specified element into the queue represented by this deque (in
  other words, at the tail of this deque) if it is possible to do so immediately
  without violating capacity restrictions, returning true upon success and
  throwing an IllegalStateException if no space is currently available.
  */
  public void addLast(QUASAR x);

  /*
  Retrieves, but does not remove, the first element of this deque, or returns
  null if this deque is empty.
  */
  public void addFirst(QUASAR x);

  /*
  Retrieves and removes the first element of this deque. This method differs
  from pollFirst only in that it throws an exception if this deque is empty.
  */
  public QUASAR removeFirst();

  /*
  Inserts the specified element at the front of this deque if it is possible to
  do so immediately without violating capacity restrictions, throwing an
  IllegalStateException if no space is currently available. When using a
  capacity-restricted deque, it is generally preferable to use method offerFirst(E).
  */
  public QUASAR removeLast();

  /*
  Retrieves, but does not remove, the head of the queue represented by this deque
  (in other words, the first element of this deque). This method differs from
  peek only in that it throws an exception if this deque is empty.
  */
  public QUASAR peekFirst();

  /*
  Retrieves, but does not remove, the last element of this deque, or returns
  null if this deque is empty.
  */
  public QUASAR peekLast();

  /*
  Inserts the specified element into the queue represented by this deque
  (at the tail of this deque)
  Returns true if enough space to offer and false if not
  */
  public boolean offerLast(QUASAR x);

  /*
  Inserts the specified element at the front of this list.
  */
  public boolean offerFirst(QUASAR x);

  /*
  Retrieves and removes the head of the queue represented by this deque (in
  other words, the first element of this deque), or returns null if this deque
  is empty.
  */
  public QUASAR pollFirst();

  /*
  Retrieves and removes the last element of this list, or returns null if this
  list is empty.
  */
  public QUASAR pollLast();

  /*
  Retrieves, but does not remove, the first element of this deque.
  This method differs from peekFirst only in that it throws an exception if
  this deque is empty.
  */
  public QUASAR getFirst();

  /*
  Retrieves, but does not remove, the last element of this deque.
  This method differs from peekLast only in that it throws an exception if this deque is empty.
  */
  public QUASAR getLast();




}//end interface Deque
