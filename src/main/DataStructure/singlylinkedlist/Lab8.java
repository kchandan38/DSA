package DataStructure.singlylinkedlist;

//Delete the Last Node of LinkedList
public class Lab8 {


    private static Node head = null;
    private static Node tail = null;

    private static void insertNode(int data) {

        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else
            tail.next = newNode;
        tail = newNode;
    }

    private void printLL(Node headNode) {
        while (headNode != null) {
            System.out.print(headNode.data + " ");
            headNode = headNode.next;
        }
    }

    private void deleteLast(Node node) {

        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;

    }

    public static void main(String[] args) {

        Lab8 lab8 = new Lab8();
        insertNode(10);
        insertNode(50);
        insertNode(30);
        insertNode(40);
        insertNode(50);

        lab8.printLL(head);

        lab8.deleteLast(head);
        System.out.println("\n--------------------");

        lab8.printLL(head);

        lab8.deleteLast(head);
        System.out.println("\n--------------------");

        lab8.printLL(head);
        lab8.deleteLast(head);
        System.out.println("\n--------------------");

        lab8.printLL(head);
    }


}
