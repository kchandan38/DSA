package DataStructure.rest;

import java.util.ArrayList;

public class ThreadExampleWithRunnable implements Runnable {

    ArrayList<Integer> al;

    public ThreadExampleWithRunnable(ArrayList<Integer> al) {
        this.al = al;
    }

    @Override
    public void run() {

        for (Integer a : al) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            al.add(i);
        }
        ThreadExampleWithRunnable fz = new ThreadExampleWithRunnable(al);

        System.out.println("START 1______________________________");
        Thread th = new Thread(fz);
        th.start();
        System.out.println("END 1______________________________");

        System.out.println("START 2______________________________");
        Thread th1 = new Thread(fz);
        th1.start();
        System.out.println(" END 2______________________________");

        System.out.println("START 3______________________________");
        Thread th2 = new Thread(fz);
        th2.start();
        System.out.println("END 3______________________________");
    }


}
