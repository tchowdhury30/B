// Team FrogHats: Prattay Dey, Tasnim Chowdhury, Kevin Cheng
// APCS pd8
// L05 -- pulling it together
// 2022-02-03
// time spent: 2.0 hrs

/***
 * class StatPrinterApp
 * driver for class StatPrinter
 ***/

import java.util.ArrayList;

public class StatPrinterApp
{
  public static void main( String[] args )
  {
    /*=================
      data:
      [2,5,2,3,4,4,4]
      desired _freq:
      [0,0,2,1,3,1]
      freq initially:
      [0,0,0,0,0,0]
      =================*/

    //declare and initialize an ArrayList typed for Integers
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    al1.add(2);
    al1.add(5);
    al1.add(2);
    al1.add(3);
    al1.add(4);
    al1.add(4);
    al1.add(4);

    StatPrinter sp1 = new StatPrinter( al1 );

    System.out.println( "sp1 testing... " );
    sp1.max( al1 );
    sp1.printHistogram( 50 );


    //construct data [2,3,2,5,2,3]
    //   _frequency should be [0,0,3,2,0,1]
    ArrayList<Integer> al2 = new ArrayList<Integer>();
    al2.add(2);
    al2.add(3);
    al2.add(2);
    al2.add(5);
    al2.add(2);
    al2.add(3);

    StatPrinter sp2 = new StatPrinter( al2 );

    System.out.println( "sp2 testing: " );
    System.out.println( "al2 max: " + sp1.max(al2) );
    System.out.println( "local modes: " );
    for( Integer i : al2 ) {
    System.out.println( i + " is local mode?\t" + sp2.isLocalMode(i) );
    }
    System.out.println( "histogram:" );
    sp2.printHistogram( 50 );
  }

}//end StatPrinterApp
