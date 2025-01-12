package com.datastructure.doublelinklist;

//Delete at the beginning of the doubly linked list
public class Lab17 {

    static Node head;
    static Node tail;

    private static void InsertLastNode(int data) {

        Node newNode = new Node(data);

        if(head==null)
            head = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    static void printNextData(){

        Node headNode = head;

        while (headNode!=null) {
            System.out.print(headNode.data + " ");
            headNode = headNode.next;
        }
    }

    public static void main(String[] args) {

        InsertLastNode(10);
        InsertLastNode(20);
        InsertLastNode(30);
        InsertLastNode(40);
        InsertLastNode(50);

        printNextData();
        System.out.print("\n----------------\n");

        System.out.print("\n----------------\n");
        printNextData();
        System.out.print("\n----------------\n");

        System.out.print("\n----------------\n");
        printNextData();
        System.out.print("\n----------------\n");

    }
}
