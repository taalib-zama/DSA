package treedepthfirstsearch.solution;

public class Tester {
    public static void main(String[] args) {
         /*given tree
                             4
                           /    \
                         6       7
                       / \      /  \
                     3    5    1     2

         */
        //Defining the above tree. using the user defined Class Binarytree.
        BinaryTree binaryTree = new BinaryTree(
                4, new BinaryTree(6,new BinaryTree(3), new BinaryTree(5)),
                        new BinaryTree(7,new BinaryTree(1), new BinaryTree(2))
        );
        System.out.println(binaryTree);             //calls toString method of BinaryTree class.
        Traversal traversal = new Traversal();
        traversal.dfsInorder(binaryTree);
        System.out.println();
        traversal.dfsPostorder(binaryTree);
        System.out.println();
        traversal.dfsPreorder(binaryTree);


    }
}
