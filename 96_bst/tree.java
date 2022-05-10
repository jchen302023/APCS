

public class tree {
  /*****************************************************
    * TreeNode search(int)
    * returns pointer to node containing target,
    * or null if target not found
    *****************************************************/
   public TreeNode search( int target )
   {
     return search(_root, target);
     /*** YOUR IMPLEMENTATION HERE ***/
   }

   public TreeNode search( TreeNode node, int target) {
     if (node == null) {
       return null;
     }
     if (node.getValue() == target) {
       return node;
     }
     else {
       if (node.getValue() > target) {
         search (node.getLeft(), target);
       }
       if (node.getValue() < target) {
         search (node.getRight(), target);
       }
     }

   }

   /*****************************************************
    * int height()
    * returns height of this tree (length of longest leaf-to-root path)
    * eg: a 1-node tree has height 1
    *****************************************************/
   public int height()
   {
     return height(_root); 
     /*** YOUR IMPLEMENTATION HERE ***/
   }

   public int height(TreeNode node) {
     if (node == null) {
       return 0;
     }
     int lh = height(node.getLeft());
     int rh = height(node.getRight());

     if (lh > rh) {
       return lh + 1;
     }
     else { return rh + 1; }
   }


   /*****************************************************
    * int numLeaves()
    * returns number of leaves in tree
    *****************************************************/
   public int numLeaves()
   {
     /*** YOUR IMPLEMENTATION HERE ***/
   }
}
