import DataStructure.java8practice.Employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadDataFromFileAndWriteToAnotherFile {

    public static void main(String[] args) throws IOException {

        Set<Employee> emp;
        try (Stream<String> data = Files.lines(Path.of("src/main/resources/employee.csv"))) {
            emp = data.map(ReadDataFromFileAndWriteToAnotherFile::getEmployeeData)
                    .collect(Collectors.toSet());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter pw = new PrintWriter(String.valueOf(Path.of("src/main/resources/employee_copy.csv")))) {

            emp.stream()
                    .map(employee -> employee.id() + "," + employee.name()+ "," + employee.cityName()).forEach(line -> pw.write(line + "\n"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private static Employee getEmployeeData(String s) {

        String[] data = s.split(",");
        return new Employee(data[0], data[1], data[2]);
    }
}
