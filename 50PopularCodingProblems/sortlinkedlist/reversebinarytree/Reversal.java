package sortlinkedlist.reversebinarytree;

public class Reversal {
    // Given a binary tree of integers, perform reversal using modification of node links.
    public void reverse(BinaryTree tree){
        //swapping the left node with right node. If only the current node is not a leaf.
        //creating a temp for reversal operation.
        if(tree.left == null || tree.right == null){
            return;
        }
        BinaryTree temp = tree.right;
        tree.right = tree.left;
        tree.left = temp;
        reverse(tree.left);
        reverse(tree.right);
    }

}
