package com.datastructure.binarytree;

//Create a binary tree with Pre order traversal
//Root => Left => Right
public class Lab2 {

    public static void preOrder(Node root){

        if(root!= null){
            System.out.print(root.key + "\t");
            preOrder(root.left);
            preOrder(root.right);
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

        preOrder(root);

    }
}
