
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateDataAndWriteInAFileM1 {
    public static void main(String[] args) throws IOException {
        List<String> inputData = Files.readAllLines(Paths.get("src/main/resources/employee.csv"));
        Set<String> uniqueData = new HashSet<>(inputData);
        Files.write(Path.of("src/main/resources/employee111111.csv"),uniqueData);
    }
}
