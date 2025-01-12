package com.datastructure.singlylinkedlist;

//Insert the Node at given position of LinkedList
public class Lab6 {

    static Node head = null;
    static Node tail = null;

    private void createLinkedList(int data) {

        Node tempNode = new Node(data);
        if (head == null) {
            head = tempNode;
        } else {
            tail.next = tempNode;
        }
        tail = tempNode;
    }

    private void insertNodeAtLinkedList(int i, Node newNode) {

        if (i == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node positionNode = head;
        for (int j = 1; j < i - 1 && positionNode != null; j++) {
            positionNode = positionNode.next;
        }
        if (positionNode == null)
            return;
        newNode.next = positionNode.next;
        positionNode.next = newNode;
    }

    private void listData() {

        Node listNode = head;
        while (listNode != null) {
            System.out.print(listNode.data + " ");
            listNode = listNode.next;
        }
    }

    public static void main(String[] args) {

        Lab6 lab6 = new Lab6();
        Node newNode = new Node(99);
        lab6.createLinkedList(10);
        lab6.createLinkedList(20);
        lab6.createLinkedList(30);
        lab6.createLinkedList(40);
        lab6.createLinkedList(50);
        lab6.createLinkedList(60);
        lab6.listData();
        System.out.println("\n--------------------------");
        lab6.insertNodeAtLinkedList(8, newNode);
        lab6.listData();
    }
}
