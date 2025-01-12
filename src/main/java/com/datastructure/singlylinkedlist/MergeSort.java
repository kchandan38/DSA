package com.datastructure.singlylinkedlist;

public class MergeSort {

    private static Node head;
    private static Node tail;

    private static void insert(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            tail = head = newNode;
        } else {
            tail = tail.next = newNode;
        }
      //  tail = newNode;
    }

    private static void printLinkedList(Node head){

        Node list = head;
        while (list!=null){
            System.out.print(list.data +"->");
            list = list.next;
        }
    }

    private static Node getMidNode(Node head){

        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        insert(10);
        insert(30);
        insert(60);
        insert(70);
        insert(80);
        insert(90);
        insert(210);
        insert(34);
        insert(23);
        insert(76);
        insert(21);

        printLinkedList(head);

        System.out.println("\n------------------------");

        System.out.println(getMidNode(head).data);

    }
}
