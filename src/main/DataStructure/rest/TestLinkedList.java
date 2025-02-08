package rest;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.addFirst(90);
        ll.add(3, 22);
        ll.addLast(101);
        System.out.println(ll.get(3));
        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll);

        ll.addFirst(10);


    }
}
