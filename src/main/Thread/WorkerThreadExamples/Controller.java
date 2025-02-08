package WorkerThreadExamples;


import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
public class Controller {

    @RequestMapping("worker-thread")
    @Async
    public String startWorkerThread(@RequestParam String threadName){

        try{
            Thread.sleep(1000);
            System.out.println("Worker thread is running");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Worker Thread " + threadName + "has been started ";
    }
}
