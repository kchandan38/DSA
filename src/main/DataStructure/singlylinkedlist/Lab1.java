package DataStructure.singlylinkedlist;

public class Lab1 {

    public Node head = null;
    public Node tail = null;

    private void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    private void listData() {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Lab1 lab = new Lab1();
        lab.insert(10);
        lab.insert(50);
        lab.insert(30);
        lab.insert(40);
        lab.insert(50);
        lab.listData();
    }

}
