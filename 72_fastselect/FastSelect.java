// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW72 -- So So Fast
// 2022-03-08
// time spent: 0.5 hrs

/**
ALGO
1. Take partition on the array with a=0, b= length of array -1, c= b-1
2. Take returned array and compare the new index of pivot value.
If its index is equal to y-1, then return the pivot value.
If index > y-1, take the partition of the array with a = 0, b = index -1, c = b-1
If index < y-1, take the partition of the array with a = index + 1, b = length of array -1, c = b+1
3. Repeat 2 until it returns the pivot value

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

public class FastSelect {
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
