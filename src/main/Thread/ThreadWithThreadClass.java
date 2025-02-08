package Thread;

import java.util.stream.IntStream;

public class ThreadWithThreadClass extends Thread{
    @Override
    public void run() {
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }
    public static void main(String[] args) {

        Thread th = new Thread(new ThreadWithThreadClass());
        th.start();
    }
}
