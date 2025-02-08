package DataStructure.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        return this.name.compareTo(emp.name);
    }
}

public class HashCodeAndEqualsMethodTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Chandan", "Bentonville");
        Employee emp2 = new Employee(103, "Amit", "Bentonville");
        Employee emp3 = new Employee(102, "Nancy", "Bentonville");
        Employee emp4 = new Employee(105, "Swati", "Bentonville");

        Map<Employee, String> hashMap = new HashMap<>();
        hashMap.put(emp1, "Emp1");
        hashMap.put(emp2, "Emp2");
        hashMap.put(emp3, "Emp3");
        hashMap.put(emp4, "Emp4");


        hashMap.entrySet().stream().sorted(Map.Entry.<Employee, String>comparingByKey()).forEach(System.out::println);

//
//        System.out.println(hashMap.entrySet().stream().iterator());
//
//        for (Map.Entry<Employee, String> emp : hashMap.entrySet()) {
//            System.out.println(emp.getKey().toString() + "," + emp.getValue());
//        }
    }
}
