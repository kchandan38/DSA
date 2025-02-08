package DataStructure.singlylinkedlist;

public class Lab2 {

    public Node head = null;
    public Node tail = null;

    public void insert(int data) {

        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    private void listData() {

        if (head == null)
            return;
        System.out.print(head.data + " ");
        head = head.next;
        listData();
    }

    public static void main(String[] args) {

        Lab2 lab = new Lab2();
        lab.insert(10);
        lab.insert(50);
        lab.insert(30);
        lab.insert(40);
        lab.insert(50);
        lab.listData();
    }
}
