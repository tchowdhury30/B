// Team FrogHats: Prattay Dey, Tasnim Chowdhury, Kevin Cheng
// APCS pd08
// HW68 -- recursively probing for a closed cycle
// 2022-03-01
// time spent: 1.0 hrs

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO
 * - Start at random tile, or inputted tile
   - Move to next unoccupied tile that is within the knight's range
   - If there is no unoccupied tile within knight's range and not every tile on the board has been visited, undo the last move and try a different tile within the knight's range.
   - Repeat until every tile has been visited (solution found) or all moves within knight's range has been exhausted (no solution)

 * DISCO
 * - The -1s representing the "moat" ensures that the knight cannot go out of bounds.
 * QCC
 * - Is their an easier and more organized way of testing out every possible move a knight can make? We were thinking of utilizing two int arrays, one holding changes in row and the other changes in columns.
   - Are we measuring time without delays?
   - Why is there such a big gap in time required to find a solution for a 6x6 board and a 7x7 board?

 * Mean execution times for boards of size n*n:
 * n=5   0.235s    across 5 executions
 * n=6   1.634s    across 5 executions
 * n=7   s    across __ executions
 * n=8   __s    across __ executions
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    //int startX = (int)(Math.random() * n);
    //int startY = (int)(Math.random() * n);
    //tf.findTour( startX, startY, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n;

    //init 2D array to represent square board with moat
    _board = new int[_sideLength + 4][_sideLength + 4];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    for (int row = 0; row < _sideLength + 4; row++){
      for (int col = 0; col < _sideLength + 4; col++){

        if (row > 1 && row < _sideLength + 2 && col > 1 && col < _sideLength + 2){
          _board[row][col] = 0;
        }
        else{ _board[row][col] = -1; }
        }
      }
    //---------------------------------------------------------
  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength+4; i++ ) {
      for( j=0; j < _sideLength+4; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/
  public void findTour( int x, int y, int moves )
  {
    // delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if (_solved){ System.exit(0); }

    //primary base case: tour completed
    if (moves == _sideLength * _sideLength + 1) {
      _solved = true;
      System.out.println( this ); //refresh screen
      return;
    }
    //other base case: stepped off board or onto visited cell
    if (_board[x][y] != 0) {
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves;

      System.out.println( this ); //refresh screen

      // delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      // upper right
      findTour(x - 2, y + 1, moves + 1);
      findTour(x - 1, y + 2, moves + 1);

      // lower right
      findTour(x + 1, y + 2, moves + 1);
      findTour(x + 2, y + 1, moves + 1);

      // lower left
      findTour(x + 2, y - 1, moves + 1);
      findTour(x + 1, y - 2, moves + 1);

      // upper left
      findTour(x - 1, y - 2, moves + 1);
      findTour(x - 2, y - 1, moves + 1);

      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
      _board[x][y] = 0;

      System.out.println( this ); //refresh screen
    }
  }//end findTour()

}//end class TourFinder
