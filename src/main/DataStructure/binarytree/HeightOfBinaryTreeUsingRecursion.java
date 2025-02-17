package binarytree;

class HeightOfBinaryTreeUsingRecursion {

   // Function to find the height of the tree
    static int height(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1+ Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
      
        // Representation of the input tree:
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5
        //      \
        //       6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        System.out.println(height(root));
    }
}