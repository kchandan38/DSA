package Java11Features;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class AsyncRestApiCall {
    private static final  HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .connectTimeout(Duration.ofSeconds(20))
            .build();
    public static CompletableFuture<String> fetchData(String url){

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApplyAsync(HttpResponse::body);
    }
    public static void main(String[] args) {

        List<String> apisList = List.of(
                "http://localhost:8080/apis/worker-thread?nam=1",
                "http://localhost:8080/apis/worker-thread?name=2",
                "http://localhost:8080/apis/worker-thread?name=3"
        );

        List<CompletableFuture<String>> futures = apisList.stream()
                .map(AsyncRestApiCall::fetchData)
                .toList();

        CompletableFuture<Void> allOf = CompletableFuture.allOf(
                futures.toArray((new CompletableFuture[0]))
        );
        allOf.thenRun(()-> futures.forEach(future -> future.thenAccept(System.out::println))).join();

        System.out.println("All API calls completed");
    }
}

