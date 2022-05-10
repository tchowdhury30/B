//import javax.swing.tree.TreeNode;

/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _root = new TreeNode(0);
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    insert(_root, newNode);
  }

  //recursive helper for insert(int)
  /** 
   * Check if stRoot has children:
   *   If not then just add depending on value
   *   If it does have, check the values of children and call insert on said child
   * @param stRoot subtree node
   * @param newNode what we're adding
   */
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    // check whether the value would have been added to right or left 
    //  -> this make you only focus on subtree child instead of both
    if (stRoot.getValue() <= newNode.getValue() ) {
        //check if it has a right child node
        if (stRoot.getRight() == null) {
            stRoot.setRight(newNode);
            //System.out.println("RIGHTBORN" + newNode.getValue());
        } else {
            insert(stRoot.getRight(), newNode);
        }
    } else { //then its left child that we must focus on
        if (stRoot.getLeft() == null) {
            stRoot.setLeft(newNode);
            //System.out.println("LEFTBORN" + newNode.getValue());
        } else {
            insert(stRoot.getLeft(), newNode);
        }
    }
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }

  /**
   * process currNode, then just call this on both right and left children Nodes
   * @param currNode
   */
  public void preOrderTrav( TreeNode currNode )
  {
    System.out.print(currNode.getValue());
    if (currNode.getLeft() != null) {
        preOrderTrav(currNode.getLeft());
    }
    if (currNode.getRight() != null) {
        preOrderTrav(currNode.getRight());
    }
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav(_root);
    //System.out.println("FIN");
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if (currNode.getLeft() != null) {
        inOrderTrav(currNode.getLeft());
    }
    System.out.print(currNode.getValue());
    if (currNode.getRight() != null) {
        inOrderTrav(currNode.getRight());
    }
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if (currNode.getLeft() != null) {
        postOrderTrav(currNode.getLeft());
    }
    if (currNode.getRight() != null) {
        postOrderTrav(currNode.getRight());
    }
    System.out.print(currNode.getValue());
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //main method for testing
  public static void main( String[] args )
  {
      
      BST arbol = new BST();
      
      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );
      
      System.out.println( "\n-----------------------------");
      System.out.println( "pre-order traversal:" );
      arbol.preOrderTrav();
      
      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();
      
      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();
      
      System.out.println( "\n-----------------------------");
      /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }
    
}//end class
