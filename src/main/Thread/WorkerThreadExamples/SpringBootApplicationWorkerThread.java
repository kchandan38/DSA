package WorkerThreadExamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootApplicationWorkerThread {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationWorkerThread.class, args);
    }
}
