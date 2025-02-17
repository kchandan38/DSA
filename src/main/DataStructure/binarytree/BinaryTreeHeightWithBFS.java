package binarytree;

import java.util.Deque;
import java.util.LinkedList;

public class BinaryTreeHeightWithBFS {

    private static int maxDepth(Node root) {

        if (root==null)
            return 0;

        int height = 0;

        Deque<Node> deque = new LinkedList<>();
        deque.add(root);
        while(deque!=null) {

            Node curr = deque.pop();
            if(curr.left!=null)
                deque.add(curr.left);
            if(curr.right!=null)
                deque.add(curr.right);


        }
        return height;
    }



    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.left = new Node(60);
        root.right.right = new Node(70);


        int height = maxDepth(root);
        System.out.println(height);

    }


}
