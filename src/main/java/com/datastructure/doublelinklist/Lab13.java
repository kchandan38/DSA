package com.datastructure.doublelinklist;

public class Lab13 {

    static Node head;
    static Node tail;

    private static void InsertFirstNode(int data) {

        Node newHead = new Node(data);

        if(head==null) {
            head = tail = newHead;
        }
        else {
            head.prev = newHead;
            newHead.next = head;
            head = newHead;
        }
    }

    static void printPrevData(){

        Node headNode = tail;

        while (headNode!=null) {
            System.out.print(headNode.data + " ");
            headNode = headNode.prev;
        }
    }


    public static void main(String[] args) {

        InsertFirstNode(10);
        InsertFirstNode(20);
        InsertFirstNode(30);
        InsertFirstNode(40);
        InsertFirstNode(50);

        InsertFirstNode(99);

        InsertFirstNode(100);

        InsertFirstNode(501);
        System.out.print("\n--------------\n");
        printPrevData();

    }
}
