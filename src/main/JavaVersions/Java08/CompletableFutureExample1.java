package Java08;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
public class CompletableFutureExample1 {

    private static final Logger logger = LoggerFactory.getLogger(Java08Features.class);
    public static void main(String[] args) {
        try {
            List<Integer> list = Arrays.asList(5,9,14);
            list.stream().map(num->CompletableFuture.supplyAsync(()->getNumber(num)))
                    .map(CompletableFuture->CompletableFuture.thenApply(n->n*n))
                    .map(CompletableFuture::join).forEach(System.out::println);
        }
        catch (Exception e) {
            logger.info(e.getMessage());
        }
    }
    private static int getNumber(int a)
    {
        return a*a;
    }
}  