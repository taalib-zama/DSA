package treedepthfirstsearch.solution;

public class Traversal {
    // Given a binary tree of integers, perform in-order, preorder and postorder traversals
// Time complexity: O(n)
// Space complexity: O(h)

        void dfsPreorder(BinaryTree root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            dfsPreorder(root.left);
            dfsPreorder(root.right);
        }

        void dfsInorder(BinaryTree root) {
            if (root == null) return;
            dfsInorder(root.left);
            System.out.print(root.data +" ");
            dfsInorder(root.right);
        }

        void dfsPostorder(BinaryTree root) {
            if (root == null) return;
            dfsPostorder(root.left);
            dfsPostorder(root.right);
            System.out.print(root.data + " ");
        }

    }
