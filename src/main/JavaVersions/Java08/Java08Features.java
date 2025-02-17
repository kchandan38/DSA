package Java08;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.CompletableFuture;

public class Java08Features {


    private static final Log log = LogFactory.getLog(Java08Features.class);

    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                log.info(e.getMessage());
            }
            return "Hello, world!";
        });
        future.thenAccept(System.out::println);

        System.out.println(Thread.currentThread().getName());
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10)
                .thenApplyAsync(result -> result * 2)
                .thenApplyAsync(result -> result + 5)
                .thenApplyAsync(result -> result * 423232323);
        future1.thenAccept(System.out::println);
        System.out.println(Thread.currentThread().getName());
        System.out.println("1111111111");
    }



}