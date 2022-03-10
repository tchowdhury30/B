// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW73: All About the About Face
// 2022-03-09
// time spent: 0.5 hrs

/**
ALGO:
1. Take partition on the array with lower bound at the statrt of the array and the uppperbound at the end of the array. Pivot is the last index.
2. After parttion, compare pivot with y.
3. If pivot is yth least term, return pivot value.
4. If pivot is greater then yth least term, set upperbound to index before pivot.
5. If pivot is less then yth least term, set lower bound to index after pivot
6. Repeat all steps until step 3 is true.

BEST CASE
Already sorted array, bigO would be O(n) since it would only have to iterate only once to find
WORST CASE
Reverse sorted array, bigO would be O(n^2)

DISCO
- It doesn't matter what c is as long as it is between a and b because the array is never
guaranteed to be sorted

QCC
- Is there a faster way that's not O(n^2) in the worst case?
**/

public class QuickSelect {
  public static int fastselect(int[] arr, int lower, int upper, int y) {
    if (y > 0 && y < arr.length) {
      int pivot = partition(arr, 0, arr.length -1, y);
      if (pivot == y) {
        return arr[pivot -1];
      }
      if (pivot > y) {
        return fastselect(arr, 0, pivot, y);
      }
      if (pivot < y) {
        return fastselect(arr, pivot+1, arr.length, y);
      }
    }
    return -1;
  }



  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }

  //--------------^  HELPER METHODS  ^--------------


  /**
   * int mysterion(int[],int,int,int)
   * DESCRIP
   *
   * @param arr
   * @param a
   * @param b
   * @param c
   * @return int
   *
   */
  public static int partition( int arr[], int a, int b, int c)
  {
    int v = arr[c];

    swap( c, b, arr);
    int s = a;

    for( int i = a; i < b; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
    }
    swap(s,b,arr);

    return s;
  }//end mysterion

  //main method for testing
  public static void main( String[] args )
  {
    int[] general = {12,21,17,69,343, 1234};
    System.out.println(fastselect(general, 0, 6, 3)); //17

    int[] best = {1,3,14,18,24};
    System.out.println(fastselect(best, 0, 5, 3)); //14

    int[] worst = {24,18,14,3,1};
    System.out.println(fastselect(worst, 0, 5, 1)); //1

  }//end main
}
