package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadPoolWithFixedNumberOfThread {


    static Runnable job = ()->{
        IntStream.rangeClosed(1,10).forEach(System.out::println);
    };
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(5);

        System.out.println(Thread.currentThread().getName());
        pool.execute(job);
        System.out.println(Thread.currentThread().getName());
        pool.execute(job);
        System.out.println(Thread.currentThread().getName());
        pool.execute(job);
    }
}
