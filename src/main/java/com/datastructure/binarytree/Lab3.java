package com.datastructure.binarytree;

//Create a binary tree with post order traversal
//Left => Right => Root
public class Lab3 {

    public static void postorder(Node root){

        if(root!= null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + "\t");
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

        postorder(root);
    }
}
