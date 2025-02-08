package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTreeUsingIterativeMethod {
    static int height(Node root){
        int height = 0;
        Queue<Node> data = new LinkedList<>();
        data.add(root);
        while(!data.isEmpty()){

            for (int i = 0; i < data.size(); i++) {
                Node currentData = data.poll();
                if(currentData.left!=null)
                    data.add(currentData.left);

                if(currentData.right!=null)
                    data.add(currentData.right);
            }
            height++;
        }
        return height;
    }

    public static void main(String[] args) {

        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
//        node.right.left.right.left = new Node(7);
//        node.right.right = new Node(9);

        System.out.println("Height of the Tree is " + height(node));
    }
}
