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
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
   public void insert( int newVal )
   {
     TreeNode newNode = new TreeNode( newVal );

     if ( _root == null ) {
       _root = newNode;
       return;
     }
     insert( _root, newNode );
   }
   //recursive helper for insert(int)
   public void insert( TreeNode stRoot, TreeNode newNode )
   {
     if ( newNode.getValue() < stRoot.getValue() ) {
       //if no left child, make newNode the left child
       if ( stRoot.getLeft() == null )
         stRoot.setLeft( newNode );
       else //recurse down left subtree
         insert( stRoot.getLeft(), newNode );
       return;
     }
     else { // new val >= curr, so look down right subtree
       //if no right child, make newNode the right child
       if ( stRoot.getRight() == null )
         stRoot.setRight( newNode );
       else //recurse down right subtree
         insert( stRoot.getRight(), newNode );
       return;
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



    /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
      {
      	/*** YOUR IMPLEMENTATION HERE ***/
        return search (target, _root);
      }

    TreeNode search( int target, TreeNode currNode)
    {
      if (currNode == null) {
        return null;
      }
      if (target == currNode.getValue()) {
        return currNode;
      }
      if (target < currNode.getValue()) {
        return search(target, currNode.getLeft());
      }
      else {
        return search(target, currNode.getRight());
      }
    }


    /*****************************************************
     * int height()
     * returns height of this tree (length of longest leaf-to-root path)
     * eg: a 1-node tree has height 1
     *****************************************************/
    public int height()
    {
    	/*** YOUR IMPLEMENTATION HERE ***/
      return height(_root);
    }

    public int height(TreeNode currNode) {
      if (currNode == null) {
        return 0;
      } else {
        int _lh = height(currNode.getLeft());
        int _rh = height(currNode.getRight());
        if (_rh > _lh) {
          return 1 + _rh;
        } else {
          return 1 + _lh;
        }
      }
    }


    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
    	/*** YOUR IMPLEMENTATION HERE ***/
      return numLeaves(_root);
    }

    public int numLeaves(TreeNode currNode) {
      if (currNode == null) {
        return 0;
      }
      return 1 + numLeaves(currNode.getLeft()) + numLeaves(currNode.getRight());
    }



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

      System.out.println("Height: " + arbol.height());
      //System.out.println(arbol.search(0).getValue());
      //System.out.println(arbol.search(7).getValue());
      System.out.println("Searching for 5: " + arbol.search(5).getValue());
      System.out.println("Number of Leaves: " + arbol.numLeaves());
      /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class
