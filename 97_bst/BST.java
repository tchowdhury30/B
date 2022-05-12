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
         newNode.setParent(stRoot);
       else //recurse down left subtree
         insert( stRoot.getLeft(), newNode );
       return;
     }
     else { // new val >= curr, so look down right subtree
       //if no right child, make newNode the right child
       if ( stRoot.getRight() == null )
         stRoot.setRight( newNode );
         newNode.setParent(stRoot);
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
        _parent = null;
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


    public void remove(int target)
    {
      if (target == null) {
        
      }
      TreeNode removeNode = search(target);
      remove(target, removeNode);
    }


    public void remove(int target, TreeNode removeNode) 
    {
      TreeNode inheritor = null;
      //checkingg for two children
      if (removeNode.getLeft() != null && removeNode.getRight() != null){
        inheritor = findMax(removeNode.getLeft());
        //inheritor.getParent().setRight(null);
      } else {
        //which child is there?
        if (removeNode.getLeft() != null) { //left
          inheritor = removeNode.getLeft();
        } else {                            //right
          inheritor = removeNode.getRight()
        }
        if (removeNode.getParent().getValue() > removeNode.getValue()){    
          removeNode.getParent().setRight(inheritor);
        } else {
          removeNode.getParent().setLeft(inheritor);
        }
      }
    }

    /**
     Take the right child of the left subtree. This will keep on checking if curr has a right child.
     */
    public TreeNode findMax(TreeNode currNode){
      if (currNode == null) {
        return null;
      }
      if (currNode.getRight() != null) {
        return findMax(currNode.getRight());
      } else {
        return currNode;
      }
    }



    
    //main method for testing
    public static void main( String[] args ) {

      BST arbol = new BST();

      System.out.println( "tree init'd: " + arbol );

      //inserting in this order will build a perfect tree
      arbol.insert( 3 );
      arbol.insert( 1 );
      arbol.insert( 0 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 4 );
      arbol.insert( 6 );
      /*
      */

      //insering in this order will build a linked list to left
      /*
      arbol.insert( 6 );
      arbol.insert( 5 );
      arbol.insert( 3 );
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 1 );
      arbol.insert( 0 );
      */

      System.out.println( "tree after insertions:\n" + arbol );
      System.out.println();

      System.out.println();
      for( int i=-1; i<8; i++ ) {
          System.out.println(" searching for "+i+": " + arbol.search(i) );
      }

      System.out.println();
      System.out.println( arbol );

      arbol.remove(6);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(5);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(4);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(3);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(2);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(1);
      System.out.println();
      System.out.println( arbol );

      arbol.remove(0);
      System.out.println();
      System.out.println( arbol );
    }tem.out.println();
  	System.out.println( arbol );
    } 

}//end class
