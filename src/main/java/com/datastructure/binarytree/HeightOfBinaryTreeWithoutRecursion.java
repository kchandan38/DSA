package com.datastructure.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class HeightOfBinaryTreeWithoutRecursion {

   // Function to find the height of the tree
    static int height(Node root) {
        if (root == null) return 0;

        // Initializing a variable to count 
        // the height of the tree
        int height = 0;

        Queue<Node> q = new LinkedList<>();

        // Pushing the first level element 
        // along with null
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            // When null is encountered, 
            // increment the height
            if (curr == null) {
                height++;

                // If queue still has elements left, 
                // push null again to the queue
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } 
            else {

                // If null is not encountered, 
                // keep moving
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return height;
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