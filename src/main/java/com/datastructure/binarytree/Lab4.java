package com.datastructure.binarytree;

//To find height of the tree
public class Lab4 {

    public static int height(Node root){

        if(root == null)
            return 0;
        else{
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return 1 + Math.max(leftHeight, rightHeight);
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
        //root.right.right = new Node(70);

        System.out.println("Height of the tree:  " + height(root));
    }
}
