package binarytree;

//Create a binary tree with In order traversal
//Left => Root => Right
public class Lab1 {

    public static void inorder(Node root){

        if(root!= null){
            inorder(root.left);
            System.out.print(root.key + "\t");
            inorder(root.right);
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

        inorder(root);

    }
}
