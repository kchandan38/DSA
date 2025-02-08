package binarytree;

//To find size of the tree
public class Lab5 {

    public static int getSize(Node root){

        if(root == null)
            return 0;
        else{
            int leftSize= getSize(root.left);
            int rightSize = getSize(root.right);
            return 1 + leftSize + rightSize;
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
        System.out.println("Size of the tree:  " + getSize(root));
    }
}
