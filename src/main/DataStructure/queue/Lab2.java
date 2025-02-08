package DataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;

//Create the LinkedList Object and add the value do operations in under Queue Interface
public class Lab2 {

    public static void main(String[] args) {

        Queue<String> linkedList = new LinkedList<>();
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());

        System.out.println("---------------------------------------------");

        linkedList.add("Chandan");
        linkedList.add("Chandan");
        linkedList.add("Allen");
        linkedList.add("Roshan");
        linkedList.add("Amit");
        linkedList.add("Puja");

        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());

        System.out.println("---------------------------------------------");

        linkedList.remove();
        linkedList.poll();
        System.out.println(linkedList.peek());
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());

    }
}

