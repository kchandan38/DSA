package binarytree;

//To find max value of node in the tree
public class Lab6 {

    public static int getMax(Node root){

        if(root == null)
            return Integer.MIN_VALUE;
        else{
            int leftMax= getMax(root.left);
            int rightMax = getMax(root.right);
            int max = Math.max(leftMax, rightMax);
            return Math.max(root.key, max);
        }
    }
    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.left = new Node(60);
        root.right.right = new Node(70);

        root.left.left.left = new Node(100);
        root.left.left.left.left = new Node(120);
        System.out.println("Max value :  " + getMax(root));
    }
}
