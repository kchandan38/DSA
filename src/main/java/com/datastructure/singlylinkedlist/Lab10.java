package com.datastructure.singlylinkedlist;

//Search the Node in LinkedList

public class Lab10 {

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

    private static boolean searchItem(int data) {

        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == data)
                return true;
            currentNode = currentNode.next;
        }
        return false;
    }


    public static void main(String[] args) {

        Lab10 lab = new Lab10();
        lab.insert(10);
        lab.insert(20);
        lab.insert(30);
        lab.insert(40);
        lab.insert(50);
        lab.insert(60);
        lab.insert(70);
        lab.listData(head);

        System.out.println("\n-----------------------------");

        System.out.println(searchItem(80));
        System.out.println(searchItem(100));

        lab.listData(head);
    }
}
