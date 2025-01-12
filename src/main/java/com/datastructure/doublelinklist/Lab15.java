package com.datastructure.doublelinklist;

public class Lab15 {

    static Node head;
    static Node tail;

    static int length;

    private static void InsertLastNode(int data){

        Node temp = new Node(data);

        if(head==null){
             head = tail = temp;
            length++;
        }else{

            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            length++;
        }
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


        InsertLastNode(501);
        printNextData();
        System.out.print("\n--------------\n");
        printNextData();

        System.out.println("D.L.L Size: " + length);
    }
}
