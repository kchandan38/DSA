package binarytree;

//To find min value of node in the tree
public class Lab7 {

    public static int getMin(Node root){

        if(root == null)
            return Integer.MAX_VALUE;
        else{
            int leftMin= getMin(root.left);
            int rightMin = getMin(root.right);
            int min = Math.min(leftMin, rightMin);
            return Math.min(root.key, min);
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
        root.left.left.left.left = new Node(-1);
        System.out.println("Max value :  " + getMin(root));
    }
}
