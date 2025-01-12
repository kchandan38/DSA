package com.datastructure.doublelinklist;

public class Lab16 {

    static Node head;
    static Node tail;

    private static void InsertLastNode(int data) {

        Node newNode = new Node(data);

        if(head==null)
            head = tail = newNode;

        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    private static void InsertInPosition(int position, int data) {

        //1. Create New Node
        Node newNode = new Node(data);

        //2. If head node is null
        if(head==null)
            head = tail = newNode;

        //3. If Position is 1
        if(position==1){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        //4. Move the position -1 Node
        Node addPosition = head;
        for (int i=1; i<position-1; i++){
            addPosition = addPosition.next;
        }

        //5. If Position is Out of Range
        if(addPosition==null)
            return;

        // 6. Insert the node in an appropriate place

        newNode.next = addPosition.next;
        addPosition.next.prev = newNode;

        addPosition.next = newNode;
        newNode.prev = addPosition;


    }

    static void printNextData(){

        Node headNode = head;

        while (headNode!=null) {
            System.out.print(headNode.data + " ");
            headNode = headNode.next;
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

        InsertLastNode(10);
        InsertLastNode(20);
        InsertLastNode(30);
        InsertLastNode(40);
        InsertLastNode(50);

        printNextData();
//        System.out.print("\n----------------\n");
//        printPrevData();
        InsertInPosition(2,99);
        InsertInPosition(3,999);
        System.out.print("\n----------------\n");
        printNextData();
//        System.out.print("\n----------------\n");
     //   printPrevData();
        //InsertInPosition(4,44);
      //  System.out.print("\n----------------\n");
     //   printNextData();
//        System.out.print("\n----------------\n");
//        printPrevData();

    }
}
