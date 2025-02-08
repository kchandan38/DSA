package Java11Features;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class AsyncRestApiWithRetry {
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    private static final int MAX_RETRIES = 3;

    public static CompletableFuture<String> fetchData(String url, int retryCount) {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
        return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response -> {
            if (response.statusCode() >= 200 && response.statusCode() < 300) {
                return response.body();
            } else {
                throw new RuntimeException("Failed with HTTP status: " + response.statusCode());
            }
        }).exceptionally(ex -> {
            if (retryCount < MAX_RETRIES) {
                System.out.println("Retrying " + url + " (Attempt " + (retryCount + 1) + ")");
                return fetchData(url, retryCount + 1).join();
            } else {
                System.out.println("Failed after " + MAX_RETRIES + " attempts: " + url);
                return "Error: " + ex.getMessage();
            }
        });
    }
    public static void main(String[] args) {
        List<String> apiUrls = List.of(
                "https://jsonplaceholder.typicode.com/posts/1",
                "https://jsonplaceholder.typicode.com/posts/2",
                "https://jsonplaceholder.typicode.com/posts/invalid-url"); // Simulating failure

        // Execute all API calls asynchronously with retries
        List<CompletableFuture<String>> futures = apiUrls.stream() .map(url -> fetchData(url, 0)).toList();
        // Combine all futures and wait for completion
        CompletableFuture<Void> allOf = CompletableFuture.allOf( futures.toArray(new CompletableFuture[0]) );
        // Process results after all requests complete
        allOf.thenRun(() -> futures.forEach(future -> future.thenAccept(System.out::println))).join();
        // Wait for completion S
        System.out.println("All API calls completed!"); } }