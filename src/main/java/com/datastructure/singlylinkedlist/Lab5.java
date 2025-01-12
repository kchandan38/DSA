package com.datastructure.singlylinkedlist;

//Insert the Node at the end of LinkedList
public class Lab5 {

    private static Node head = null;
    private static Node tail = null;

    public static void insertAtEnd(int data) {

        Node tempNode = new Node(data);
//        if(head == null){
//            head = tempNode;
//            return;
//        }
//        tail = head;
//        while (tail.next!=null){
//            tail = tail.next;
//        }
//        tail.next = tempNode;

        if (head == null) {
            head = tempNode;
        } else {
            tail.next = tempNode;
        }
        tail = tempNode;
    }

    private static void listData() {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Lab5 lab5 = new Lab5();
        lab5.insertAtEnd(10);
        lab5.insertAtEnd(20);
        lab5.insertAtEnd(30);
        lab5.insertAtEnd(40);

        lab5.listData();

    }
}
