package binarytree;

//To print the nodes at K Distnace from the root node
public class Lab8 {

    public static void printKDistanceNodes(Node root, int k){
        if(root == null)
            return;

        if(k == 0)
            System.out.print(root.key + "\t");
        else{
            printKDistanceNodes(root.left, k-1);
            printKDistanceNodes(root.right, k-1);
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

        //printKDistanceNodes(root, 2);

    }
}
