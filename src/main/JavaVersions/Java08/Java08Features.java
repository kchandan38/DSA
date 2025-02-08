package Java08;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;

public class Java08Features {
    private static final Logger logger = LoggerFactory.getLogger(Java08Features.class);
    public static void main(String[] args) {
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                logger.info(e.getMessage());
//            }
//            return "Hello, world!";
//        });
//        future.thenAccept(System.out::println);

        System.out.println(Thread.currentThread().getName());
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10)
                .thenApplyAsync(result -> result * 2)
                .thenApplyAsync(result -> result + 5)
                .thenApplyAsync(result -> result * 423232323);
        future.thenAccept(System.out::println);
        System.out.println(Thread.currentThread().getName());
        System.out.println("1111111111");
    }



}