/**
   driver file for testing class RunMed

   (RunMed provides for calculating a running median
   of a stream of input ints)

   USAGE: Runnable as-is.
   Uncomment RunMed-specific lines below once RunMed is implemented.
   Compile, run fr same dir as RunMed.java

   to feed numbers manually:
   $ java RunMed

   to feed in prepared set:
   $ java RunMed < input.nums
   (input.nums provided; must be in same dir)

   -------------------------
   Clyde "Thluffy" Sinclair
   APCS
   2018-05-17
*/

import java.util.Scanner;

public class RunMedDriver
{
  public static void main( String[] args )
  {

    // RunMed r = new RunMed();

    int n;
    double median;
    int count = 0;
    Scanner sc = new Scanner( System.in );

    while( sc.hasNextInt() ) {
      try {
        n = sc.nextInt();
        System.out.print("read " + n + "\n");

        count++;
        System.out.print("this many ints have been seen: " + count + "\n");

        // r.add(n);
        // median = r.getMedian();
        // System.out.print("median is now " + median + "\n");
      } catch (Exception e) {
        System.err.println("BOOP! probs w yer input:\n"+e);
      }
    }

  }//end main

}//end class
