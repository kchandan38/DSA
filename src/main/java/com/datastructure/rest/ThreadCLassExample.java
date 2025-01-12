package com.datastructure.rest;

import java.util.LinkedList;

public class ThreadCLassExample extends Thread {
    LinkedList<Integer> al;

    public ThreadCLassExample(LinkedList<Integer> al) {
        this.al = al;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        al.forEach(System.out::println);
    }

    public static void main(String[] args) {

        LinkedList<Integer> al = new LinkedList<>();
        for (int i = 0; i <= 50; i++) {
            al.add(i);
        }
        ThreadCLassExample fz = new ThreadCLassExample(al);

        System.out.println("START 1______________________________");
        new Thread(fz).start();
        System.out.println("END 1______________________________");

        System.out.println("START 2______________________________");
        new Thread(fz).start();
        System.out.println(" END 2______________________________");

        System.out.println("START 3______________________________");
        new Thread(fz).start();
        System.out.println("END 3______________________________");
    }


}
