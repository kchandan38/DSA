package com.datastructure.rest;

import java.util.*;

public class ComparableInterfaceTest {

    static class Employee implements Comparator<Employee>{

        private int id;
        private String firstName;
        private String lastName;

        private String cityName;

        private int getId(){
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public Employee(){}

        public Employee(int id, String firstName, String lastName, String cityName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.cityName = cityName;
        }
        @Override
        public String toString() {
            return id + " " + firstName + " " + lastName + " " + cityName;
        }

        /**
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return
         */
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getId()-o2.getId();
        }
    }
    public static void main(String[] args) {

    Employee emp1 = new Employee(102, "Chandan", "Gupta","Bentonville");
    Employee emp2 = new Employee(100, "Amit", "Shaw","Dhanbad");
    Employee emp3 = new Employee(101, "Puja", "Gupta","Ahemdabad");
    Employee emp4 = new Employee(105, "Chandani", "Kumari","Kolkata");
    Employee emp5 = new Employee(107, "Ramesh", "Sutar","Bentonville");

    List<Employee>  employees = new ArrayList<>();
    employees.add(emp1);
    employees.add(emp2);
    employees.add(emp3);
    employees.add(emp4);
    employees.add(emp5);

    employees.sort(new Employee());

    employees.forEach(S-> System.out.println(S.toString()));

    }
}
