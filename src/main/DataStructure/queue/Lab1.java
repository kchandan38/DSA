package DataStructure.queue;

import javax.sound.midi.Soundbank;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//Create the Array Deque and insert the value of it and print the values
public class Lab1 {

    public static void main(String[] args) {
        Queue<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());
        System.out.println(arrayDeque.isEmpty());

        System.out.println("-----------------------------------");

        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(40);
        arrayDeque.add(50);
        arrayDeque.add(60);
        arrayDeque.add(90);
        arrayDeque.add(240);
        arrayDeque.add(150);
        arrayDeque.add(230);
        arrayDeque.add(310);
        arrayDeque.add(320);
        arrayDeque.add(440);
        arrayDeque.add(250);
        arrayDeque.add(130);
        arrayDeque.add(3100);
        arrayDeque.add(3204);
        arrayDeque.add(4404);
        arrayDeque.add(2507);
        arrayDeque.add(1307);

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());
        System.out.println(arrayDeque.isEmpty());

        System.out.println(arrayDeque.peek());
        arrayDeque.remove();
        arrayDeque.poll();
        arrayDeque.stream().sorted();

        System.out.println("-----------------------------------");

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());
        System.out.println(arrayDeque.isEmpty());

//        for (int i: arrayDeque.stream().sorted()){
//            System.out.println(i);
//        }
    }
}
