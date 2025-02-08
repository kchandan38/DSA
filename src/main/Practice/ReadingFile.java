import DataStructure.java8practice.Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;

public class ReadingFile {

    public static void main(String[] args) throws IOException {

        List<String> data = Files.readAllLines(Path.of("src/main/resources/employee.csv"));
        try(PrintWriter pw = new PrintWriter("src/main/resources/employee2.csv")){

            new HashSet<>(data)
                    .stream()
                    .map(ReadingFile::getEmployeeData)
                    .map(employee -> employee.id()+","+employee.name()+","+employee.cityName())
                    .forEach(line->pw.write(line + "\n"));
        }
    }
    private static Employee getEmployeeData(String s) {
        String[] data = s.split(",");
        return new Employee(data[0], data[1],data[2]);
    }
}