package DataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Element traversal in the reverse order
public class Lab4 {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        System.out.println(stack);
    }
}
