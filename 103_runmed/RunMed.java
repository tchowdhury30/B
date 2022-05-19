/**
Calculating running media of input integer stream
use minheap/maxheap combo
1. if next val < root of maxheap, add to maxheap
  else add to minheap
2. balance heaps (so that size difference < 2) (remove from larger heap, add to smaller heap)
  at any time find med by:
    a) heap sizes equal: med is mean of roots
    b) heap sizes !equal: med is root of larger heap
**/

public class RunMed {

  ALHeapMax lilVals;
  ALHeapMin bigVals;

  public RunMed() {
    lilVals = new ALHeapMax()
    bigVals = new ALHeapMin();
  }

  public int getMedian() throws NoSuchElementException() {
    if ( lilVals.size() == bigVals.size() ) {
      return (lilVals.peekMax() + bigVals.peekMin())/2;
    } else {
      if (lilVals.size() > bigVals.size() ) {
        return lilVals.getMax();
      } else {
        return bigVals.getMin();
      }
    }
  }

  public void add(Integer newVal) {
    if (newVal < lilVals.peekMax()) {
      lilVals.add(newVal);
    } else {
      bigVals.add(newVal);
    }
    if (Math.abs(lilVals.size() , bigVals.size()) > 2 ) {
      if (lilVals.size() > bigVals.size() ) {
        Integer r = lilVals.removeMax();
        bigVals.add(r);
      } else {
        Integer f = bigVals.removeMin();
        lilVals.add(f);
      }
    }
  }

  public static void main(String[] args) {
    
  }
} //clas
