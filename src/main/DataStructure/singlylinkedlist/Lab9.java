package DataStructure.singlylinkedlist;

//Delete the Node at given position of S.L.L

import java.util.LinkedList;

public class Lab9 {

    public static Node head = null;
    public static Node tail = null;

    private void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    private void listData(Node node) {

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static void deleteAtPosition(int position) {

        boolean flag = true;
        Node newLL = head;
        for (int i = 0; i < position - 2 && newLL != null; i++) {
            newLL = newLL.next;
        }
        assert newLL != null;
        if (newLL.next == null || position == 0)
            return;
        if (position == 1) {
            head = newLL.next;
            return;
        }
        newLL.next = newLL.next.next;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.size();

        Lab9 lab = new Lab9();
        lab.insert(10);
        lab.insert(20);
        lab.insert(30);
        lab.insert(40);
        lab.insert(50);
        lab.insert(60);
        lab.insert(70);
        lab.listData(head);

        System.out.println("\n-----------------------------");

        deleteAtPosition(6);

        lab.listData(head);
    }

}
