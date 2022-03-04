// Team Fred - Andrey Sokolov + Geese, Tasnim Chowdury + MARY, Abdullah Faruque + Joemama
// APCS pd8
// HW69 -- maze solving (blind, depth-first)
// 2022-03-03
// time spent: 1hrs

/***
 * SKELETON for
 * class MazeSolver
 * Implements a blind depth-first exit-finding algorithm.
 * Displays probing in terminal.
 *
 * USAGE:
 * $ java Maze [path/to/mazefile]
 * (mazefile is ASCII representation of a maze, using symbols below)
 *
 * ALGORITHM for finding exit from starting position:
 * 1. Create function solveMaze that will be called recursively.
 * 2. This function will start from any tile within the initialized board.
 * 3. Checks if tile is the solution, if it is, end the program.
 * 4. Mark current tile as visited.
 * 5. Call function on squares directly adjacent vertically or horizontally to the square.
 *
 * DISCO
 * Although the algorithm works, for some reason the HERO character doesn't want to show up on some of the visited squares.
 * I think it has to do with the iterative way solve is called, but I don't know how to fix it.
 *
 * QCC
 * I wonder what would happen if the hero was put into an open room as opposed to a maze?
 * Is there a way to optimize the maze-solver, or is this the best way to solve a maze?
 *
 *
 ***/

//enable file I/O
import java.io.*;
import java.util.*;


class MazeSolver
{
  final private int FRAME_DELAY = 50;

  private char[][] _maze;
  private int h, w; // height, width of maze
  private boolean _solved;

  //~~~~~~~~~~~~~  L E G E N D  ~~~~~~~~~~~~~
  final private char HERO =           '@';
  final private char PATH =           '#';
  final private char WALL =           ' ';
  final private char EXIT =           '$';
  final private char VISITED_PATH =   '.';
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public MazeSolver( String inputFile )
  {
    // init 2D array to represent maze
    // (80x25 is default terminal window size)
    _maze = new char[80][25];
    h = 0;
    w = 0;

    //transcribe maze from file into memory
    try {
      Scanner sc = new Scanner( new File(inputFile) );

      System.out.println( "reading in file..." );

      int row = 0;

      while( sc.hasNext() ) {

        String line = sc.nextLine();

        if ( w < line.length() )
          w = line.length();

        for( int i=0; i<line.length(); i++ )
          _maze[i][row] = line.charAt( i );

        h++;
        row++;
      }

      for( int i=0; i<w; i++ )
        _maze[i][row] = WALL;
      h++;
      row++;

    } catch( Exception e ) { System.out.println( "Error reading file" ); }

    //at init time, maze has not been solved:
    _solved = false;
  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, ESC
    //emacs shortcut: M-x quoted-insert, ESC

    int i, j;
    for( i=0; i<h; i++ ) {
      for( j=0; j<w; j++ )
        retStr = retStr + _maze[j][i];
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
   * void solve(int x,int y) -- recursively finds maze exit (depth-first)
   * @param x starting x-coord, measured from left
   * @param y starting y-coord, measured from top
   **/
  public void solve( int x, int y )
  {
    try{
      delay( FRAME_DELAY ); //slow it down enough to be followable
      //primary base case - if you reached the end, mark the maze as solved
      if ( _maze[y][x] == EXIT ) {
        _maze[y][x] = HERO;
        System.out.println("you found the exit!");
        _solved = true;
        System.exit(0);
      }
      //other base cases - you reached a dead end
      else if ( _maze[y][x] == WALL || _maze[y][x] == VISITED_PATH) {
        return;
      }
      //otherwise, recursively solve maze from next pos over,
      //after marking current location
      else if( _maze[y][x] == PATH) {
        _maze[y][x] = HERO;
        System.out.println( this ); //refresh screen
        _maze[y][x] = HERO;
        int[] xOffset = {1, 0, -1, 0};
        int[] yOffset = {0, -1, 0, 1};
        for(int i = 0; i<=3; i++){
          solve(x+xOffset[i], y+yOffset[i]);
        }
        _maze[y][x] = HERO;
        System.out.println( this ); //refresh screen
        _maze[y][x] = VISITED_PATH;
        return;
      }
    } catch(ArrayIndexOutOfBoundsException e){
      return;
    }
  }

  //accessor method to help with randomized drop-in location
  public boolean onPath( int x, int y) {
      return _maze[y][x] == PATH;
  }

}//end class MazeSolver


public class Maze
{
  public static void main( String[] args )
  {
    String mazeInputFile = null;

    try {
      mazeInputFile = args[0];
    } catch( Exception e ) {
      System.out.println( "Error reading input file." );
      System.out.println( "USAGE:\n $ java Maze path/to/filename" );
    }

    if (mazeInputFile==null) { System.exit(0); }

    MazeSolver ms = new MazeSolver( mazeInputFile );

    //clear screen
    System.out.println( "[2J" );

    //display maze
    System.out.println( ms );

    //drop hero into the maze (coords must be on path)
    //ms.solve( 3, 4 );
    //drop our hero into maze at random location on path
    // YOUR RANDOM-POSITION-GENERATOR CODE HERE
    int startX = (int)(Math.random()*25);
    int startY = (int)(Math.random()*80);
    while(!(ms.onPath(startX, startY))){
      startX = (int)(Math.random()*25);
      startY = (int)(Math.random()*80);
    }
    ms.solve( startX, startY );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class Maze
