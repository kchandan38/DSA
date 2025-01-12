import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java11Features {

    public static void main(String[] args) throws IOException {

        HttpClient httpClient = HttpClient.newHttpClient();

//Creating a GET request with a specified URL
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://google.com"))
                .GET()
                .build();

//Sending the request and receiving the response asynchronously
        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);
        String str = "Hi\nHello\nNamaste";
        str.lines().filter(n->n.equals("Hello")).forEach(System.out::println);

        str.lines().toList().forEach(System.out::println);

        Path filePath = Files.writeString(Files.createTempFile(Path.of("src/main/practice"), "demo", ".csv"), "Sample text");

        String fileContent = Files.readString(filePath);

        System.out.println(fileContent);

        List<String> sampleList = List.of("Java", "\n \n", "Kotlin", " ");

        sampleList.stream().filter(Predicate.not(String::isBlank)).forEach(System.out::println);




    }


}
