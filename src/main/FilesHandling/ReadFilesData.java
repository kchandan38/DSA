
import DataStructure.java8practice.Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFilesData {

    public static void main(String[] args) throws IOException {

        List<String> data = Files.readAllLines(Path.of("src/main/resources/employee.csv"));
        try(PrintWriter fw = new PrintWriter(String.valueOf(Path.of("src/main/resources/employee_c.csv")))){
            data.stream()
                    .map(ReadFilesData::getEmployeeData)
                    .collect(Collectors.toSet())
                    .stream()
                    .map(emp->emp.id()+","+emp.name()+","+emp.cityName())
                    .forEach(line-> {
                        fw.write(line+"\n");
                    });
        }
    }
    private static Employee getEmployeeData(String s) {

        String[] data = s.split(",");
        return new Employee(data[0],data[1], data[2]);
    }
}
