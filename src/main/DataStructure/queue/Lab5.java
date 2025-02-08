package DataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lab5 {

    static Stack<Integer> stack = new Stack<>();

    static Stack<Integer> reverseQueue(Queue<Integer> myQueue) {

        if (myQueue.isEmpty())
            return stack;
        stack.push(myQueue.poll());
        reverseQueue(myQueue);
        return stack;
    }

    public static void main(String[] args) {

        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50);

        System.out.println(myQueue);
        System.out.println("-----------------------------");
        System.out.println(reverseQueue(myQueue));

    }

}
