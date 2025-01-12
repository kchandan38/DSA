package com.datastructure.singlylinkedlist;

// Insert node at the beginning
public class Lab4 {

    static Node head = null;
    static Node tail = null;

    private static void insertFirst(int data) {

        Node tempNode = new Node(data);

        if (head == null) {
            head = tempNode;
        } else {
            tail = head;
            head = tempNode;
            tempNode.next = tail;
        }
    }

    private static void listData() {

        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Lab4 lab4 = new Lab4();
        lab4.insertFirst(10);
        lab4.insertFirst(20);
        lab4.insertFirst(30);
        lab4.insertFirst(40);

        lab4.listData();
    }
}
