package binarytree;

class HeightOfBinaryTreeWithoutRecursion {

   public static int height(Node node){
       if(node==null)
           return 0;
       int leftHeight = height(node.left);
       int rightHeight = height(node.right);
       return 1 + Math.max(leftHeight, rightHeight);
   }

    public static void main(String[] args) {
      
        // Representation of the input tree:
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5   
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(height(root));
    }
}