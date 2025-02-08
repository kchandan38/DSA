package DataStructure.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//Traversing Queue elements in Forward Order
public class Lab3 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        Iterator<Integer> it = queue.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
