package DataStructure.rest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapClassTest {

    static class Employee{

        int id;
        String name;
        Double salary;

        public Employee(int id, String name, Double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public Double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employeesList = Arrays.asList(
                new Employee(1, "Alex", 100.0),
                new Employee(2, "Brian", 100.0),
                new Employee(3, "Charles", 200.0),
                new Employee(4, "David", 200.0),
                new Employee(5, "Edward", 300.0),
                new Employee(6, "Frank", 300.0)
        );

        List<Double> distinctSalaries = employeesList.stream()
                .map( e -> e.getSalary() )
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctSalaries);
    }
}
