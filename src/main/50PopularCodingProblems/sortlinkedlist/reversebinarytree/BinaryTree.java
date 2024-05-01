package sortlinkedlist.reversebinarytree;

public class BinaryTree {

        int data;           //tree to contain Integer datatype.
        BinaryTree left;    //node reference for left child node.
        BinaryTree right;   //node reference for right child node.

        //no args constructor - Tree with no subnodes.
        BinaryTree(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        //All args contructor. Tree with root nodes.
        BinaryTree(int data, BinaryTree left, BinaryTree right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }


