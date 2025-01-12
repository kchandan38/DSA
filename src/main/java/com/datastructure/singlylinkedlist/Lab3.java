package com.datastructure.singlylinkedlist;

public class Lab3 {

    Node head = null;
    Node tail = null;

    public void insert(int data) {

        Node node = new Node(data);
        if (head == null)
            head = node;
        else {
            tail.next = node;
        }
        tail = node;
    }

    public int countData() {

        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {

        Lab3 lab3 = new Lab3();
        for (int i = 0; i < 70; i = i + 4) {
            lab3.insert(i);
        }
        System.out.println(lab3.countData());
    }
}