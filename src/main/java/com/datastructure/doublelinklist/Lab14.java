package com.datastructure.doublelinklist;

public class Lab14 {

    static Node head;
    static Node tail;

    static int length;

    private static void InsertFirstNode(int data) {

        Node newHead = new Node(data);

        head.prev = newHead;
        newHead.next = head;
        head = newHead;
        length++;
    }

    private static void InsertInPosition(int position, int data) {

        Node newNode = new Node(data);
        if(position==1 && head!=null){

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            length++;
            return;
        }
        else if (head ==null)
            head = tail = newNode;
        if(position>length)
            return;
        Node addPosition = head;
        for (int i=1; i<position-1; i++){
            addPosition = addPosition.next;
        }
        newNode.next = addPosition.next;
        addPosition.next = newNode;

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


        InsertFirstNode(99);

        InsertFirstNode(100);

        printNextData();
        System.out.print("\n--------------\n");
       // printPrevData();

      //  InsertInPosition(1, 11);
 //       InsertInPosition(2, 123);


       // System.out.print("\n--------------\n");
        printNextData();

        System.out.println("D.L.L Size: " + length);

    }


}
