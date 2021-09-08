package com.main.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
//Given a list of employees, you need to filter all the employee whose age is greater than 20 and print the employee names.(Java 8 APIs only)
public class EmployeeFilter {

    public static void main(String[] args) {
        List<Employee> employeeList = createEmployeeList();

        List<String> employeeFilterList = employeeList.stream()
                .filter(e -> e.getAge() > 20)
                .map(Employee::getName)
                .collect(Collectors.toList());

        employeeFilterList.forEach((name)->System.out.println(name));

        long count = employeeList.stream()
                .filter(e -> e.getAge() > 25)
                .count();
        System.out.println("Number of employee with age 25 are :"+count);

       // Given the list of employees, find the employee with name “Mary”.
        Optional<Employee> el = employeeList.stream()
                .filter(e -> e.getName().equalsIgnoreCase("Mary")).findAny();
        if (el.isPresent())
            System.out.println("emp name with:"+el.get());

     // Given a list of employee, find maximum age of employee?

        OptionalInt max = employeeList.stream()
                .mapToInt(Employee::getAge).max();
        if (max.isPresent())
            System.out.println("max age"+max.getAsInt());

    }

    private static List<Employee> createEmployeeList() {

        List<Employee> employeeList=new ArrayList<>();

        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Gary",26);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        return employeeList;

    }
}
