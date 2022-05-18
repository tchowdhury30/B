/**
Insomniac Raccoons | Faiza Huda, Tasnim Chowdhury, Diana Akhmedova
APCS pd8
HW102 -- Heap On Heapin' On
2022-05-18w
time spent: 1 hrs

DISCO:

QCC:


 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container

**/

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
      _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    return _heap.toString();

      // String answer = "";
      // for (int i = 0; i < _heap.size(); i++){
      //     if (_heap.get(i) == null){
      //         answer += " ,";
      //     } else {
      //         answer += _heap.get(i) + ", ";
      //     }
      // }
      // return answer;
  }//O(n)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
      return _heap.size() <= 0;
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
      if (_heap.isEmpty())
        return null;
      return _heap.get(0);
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * 1. Append leaf to the bottom.
   * 2. Compare with parent.
   * 3. Swap.
   */
  public void add( Integer addVal )
  {
      if (_heap.isEmpty())
        _heap.add(addVal);

      _heap.add(addVal);
      int addValIndex = _heap.size() - 1;
      int parentIndex = parentPos(addValIndex);

      while (_heap.get(addValIndex) < _heap.get(parentIndex)) {
        swap(addValIndex, parentIndex);
        addValIndex = parentIndex;
        parentIndex = parentPos(addValIndex);
        // if (parentIndex == 0) {
        //
        // }
      }
   }
  //O(log n)


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * 1. Swap the last index and the root.
   * 2. Remove last index.
   * 3. Compare node value with its children.
   * 4. Swap with the least valued child.
   */
  public Integer removeMin()
  {
      Integer removeVal = _heap.get(0);

      if (_heap.isEmpty())
        return null;

      else {
        swap(_heap.size() - 1, 0);
        _heap.remove(_heap.size() - 1);

        int currNodeIndex = 0;

        while (minChildPos(currNodeIndex) != -1 && _heap.get(currNodeIndex) > _heap.get(minChildPos( currNodeIndex )) ) {
          int childIndex = minChildPos( currNodeIndex );
          swap(currNodeIndex, childIndex);
          currNodeIndex = childIndex;
        }
      }

      return removeVal;
  }//O(log n)


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    int indxChildLeft = (pos * 2) + 1;
    int indxChildRight = (pos * 2) + 2;

    if(pos >= _heap.size()){
      return -1;
    }
    else if(indxChildLeft >= _heap.size()){
        return -1;
    }else if (indxChildRight >= _heap.size()){
        return -1;
    }
    //if the min value of left and right children is the left child, return the index of left child
    else if(minOf(_heap.get(indxChildLeft), _heap.get(indxChildRight)).equals(_heap.get(indxChildLeft)) ){
      return indxChildLeft;
    } else{
      return indxChildRight;
    }
  }//O(1)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    // _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
    _heap.set( pos1, _heap.get(pos2) );
    _heap.set( pos2, _heap.get(pos1) );
  }

  /**
   * Find the parent to the child
   * @param pos position of the child
   * @return int position of the parent
   */
  private int parentPos (int pos)
  {
    return ((pos - 1) / 2);
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {

      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);


      
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class ALHeap
