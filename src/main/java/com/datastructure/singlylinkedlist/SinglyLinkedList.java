package com.datastructure.singlylinkedlist;

import java.util.Arrays;

// Node declaration is in separate class
// ----------------------------------
public class SinglyLinkedList {

    //defining the head and tail of a singly linked list
    public Node first = null;
    public Node last = null;
    public int nodeCount = 0;

    public String toString() {

        StringBuilder data = new StringBuilder();
        if (this.first == null)
            return "[]";
        else {
            Node headNode = this.first;
            while (headNode != null) {
                data.append(headNode.data).append(",");
                headNode = headNode.next;
            }
        }
        return "[" + data.substring(0, data.length() - 1) + "]";
    }
    public int size() {
        return nodeCount;
    }
    public boolean isEmpty(){
        return nodeCount == 0;
        }

    public void clear(){
        Node currentNode = this.first;
        while(currentNode!=null){

            Node temp = currentNode.next;
            currentNode.next=null;
            currentNode = temp;
        }
        first = last =  null;
        nodeCount = 0;
    }

    public void insertFirst(int data){

        Node newNode = new Node(data);
        if(first == null){
            last = newNode;
        }
        else{
            newNode.next = this.first;
            this.first = newNode;
        }

        nodeCount++;
    }
    public void insertLast(int data){

        Node newNode = new Node(data);
        last.next =  newNode;
        last = newNode;
        nodeCount++;
    }

    public void insertAtPosition(int position, int data){

        Node currentNode = this.first;
        Node newNode = new Node(data);
        if(first==null){
            first = newNode;
            nodeCount++;
            return;
        }
        else if(position==1){
            newNode.next = currentNode;
            first = newNode;
            nodeCount++;
            return;
        } else if(position<1){
            return;
        }
        for (int i = 0; i < position-2; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        nodeCount++;
        }

    public void deleteFirstNode() {
        Node currentNode = this.first;
        first = currentNode.next;
        nodeCount--;
    }

    public void deleteLastNode() {

        Node currentNode = this.first;
        while(currentNode.next.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        last = currentNode;
        nodeCount--;
    }

    //defining insert() function to add a node to the list
    private void insert(int data) {

        Node newNode = new Node(data);
        if (this.first == null) {
            this.first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        nodeCount++;
    }

    public static void main(String[] args) {
        //creating a new list
        SinglyLinkedList newList = new SinglyLinkedList();
        //Adding data to the list by calling the insert function
        newList.insert(10);
        newList.insert(30);
        newList.insert(50);
        newList.insert(40);
        newList.insert(80);
        newList.insert(20);
        newList.insert(5);
        newList.insert(100);
        //Displaying the data in the list by calling displayList() function


//        System.out.println(newList.toString());
//        System.out.println(newList.size());
//        System.out.println("------------------------------------");
//        newList.insertFirst(99);
//        System.out.println(newList.toString());
//        System.out.println(newList.size());
//        System.out.println("------------------------------------");
//        newList.insertFirst(11);
//        System.out.println(newList.toString());
//        System.out.println(newList.size());
//        System.out.println("------------------------------------");
//        newList.insertFirst(13);
//        System.out.println(newList.toString());
//        System.out.println(newList.size());
//        System.out.println("------------------------------------");
//        newList.insertFirst(19);
//        System.out.println(newList.toString());
//        System.out.println(newList.size());
//        System.out.println("------------------------------------");
//        newList.insertLast(999);
//        System.out.println(newList.toString());
//        System.out.println(newList.size());
//        System.out.println("------------------------------------");
//        newList.insertLast(9909);
//        System.out.println(newList.toString());
//        System.out.println(newList.size());
//        System.out.println("------------------------------------");
//        newList.insertLast(11111);
//        System.out.println(newList.toString());
//        System.out.println(newList.size());
//        System.out.println("------------------------------------");
//        newList.insertAtPosition(3,2323);
//        System.out.println(newList.toString());
//        System.out.println(newList.size());
        System.out.println(newList.toString());
        System.out.println(newList.size());
        System.out.println("------------------------------------");
        newList.insertAtPosition(2,2121);
        System.out.println(newList.toString());
        System.out.println(newList.size());
        System.out.println("------------------------------------");
        newList.deleteFirstNode();
        System.out.println(newList.toString());
        System.out.println(newList.size());
        System.out.println("------------------------------------");
        newList.deleteLastNode();
        System.out.println(newList.toString());
        System.out.println(newList.size());
        System.out.println("------------------------------------");
        newList.deleteLastNode();
        System.out.println(newList.toString());
        System.out.println(newList.size());
    }
}