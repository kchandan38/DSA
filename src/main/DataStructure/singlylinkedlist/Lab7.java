package DataStructure.singlylinkedlist;

//Delete the First Node of LinkedList
public class Lab7 {

    static Node head = null;
    static Node tail = null;

    public static void insertNode(int data) {

        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else
            tail.next = newNode;
        tail = newNode;
    }

    public void listData(Node tmpNode) {

        while (tmpNode != null) {
            System.out.print(tmpNode.data + " ");
            tmpNode = tmpNode.next;
        }
    }

    private void deleteFirst(Node tmpNode) {

        Node newHead = tmpNode.next;
        tmpNode.next = null;
        head = newHead;
    }

    public static void main(String[] args) {

        Lab7 lab7 = new Lab7();
        lab7.insertNode(10);
        lab7.insertNode(50);
        lab7.insertNode(30);
        lab7.insertNode(40);
        lab7.insertNode(50);

        lab7.listData(head);
        System.out.println("\n----------------------");
        lab7.deleteFirst(head);
        lab7.listData(head);
        System.out.println("\n----------------------");
        lab7.deleteFirst(head);
        lab7.deleteFirst(head);
        lab7.listData(head);
        System.out.println("\n----------------------");
    }
}
