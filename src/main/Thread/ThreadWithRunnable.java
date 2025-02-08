package Thread;

import java.util.stream.IntStream;

public class ThreadWithRunnable implements Runnable{
    @Override
    public void run() {
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }
    public static void main(String[] args) {
        Thread th = new Thread(new ThreadWithRunnable());
        th.start();
    }
}
