package com.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.corejava.util.MyLogger;

class Employee12 {

    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee12(String name, int id, double salary) {
        super();
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


}

public class Test {

    public static void main(String[] args) {

        List<Employee12> employeeList = new ArrayList<>();

        employeeList.add(new Employee12("Syed", 109, 3700.0));
        employeeList.add(new Employee12("Riyaz", 102, 45000.0));
        employeeList.add(new Employee12("Uddin", 101, 370000.0));
        employeeList.add(new Employee12("Avinash", 104, 21000.0));
        employeeList.add(new Employee12("Virat", 105, 25000.0));
        employeeList.add(new Employee12("Rohit", 106, 16000.0));
        employeeList.add(new Employee12("Zeeshan", 107, 19000.0));
        employeeList.add(new Employee12("Avinash", 108, 16000.0));


        //getting the employee details who hs 2nd least salary
        List<Employee12> empList = employeeList.stream().sorted((emp1, emp2) ->
                (emp1.getSalary() < emp2.getSalary()) ? -1 : (emp1.getSalary() > emp2.getSalary()) ? 1 : 0).collect(Collectors.toList());

        //Optional<Employee12> newList = Optional.ofNullable(employeeList.get(12));
        MyLogger.consoleLogger.info("List in descending order based on salary: " + empList);
        MyLogger.consoleLogger.info("Employee with 2nd least salary: " + empList.get(1));

        //arrange the employee list based on alpabhetical order of their names

        List<Employee12> myList1 = employeeList
                .stream()
                .sorted(
                        (e1, e2) -> e1.getName().compareTo(e2.getName())
                ).collect(Collectors.toList());
        MyLogger.consoleLogger.info("Employee list based on alphabetical order of employee names: " + myList1);

        //print the list by sorting the employee id in ascending order

        List<Employee12> myList2 = employeeList.stream().sorted(
                (e1, e2) -> (e1.getId() > e2.getId()) ? 1 : (e1.getId() < e2.getId() ? -1 : 0)
        ).collect(Collectors.toList());
        MyLogger.consoleLogger.info("ist by sorting the employee id in ascending order: " + myList2);

        //add 12% hike in the salaries of all the employees.

        List<Employee12> myList3 = employeeList.stream()
                .map(
                        emp -> {
                            double tax = emp.getSalary() * 12 / 100;
                            emp.setSalary(emp.getSalary() + tax);
                            return emp;
                        }
                )
                .collect(Collectors.toList());
        MyLogger.consoleLogger.info("employee list with 12% hike in the salaries: " + myList3);


        //group the employees who has same name

        Map<Object, Long> empWithSameNamesCount = employeeList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getName(), Collectors.counting()));
        MyLogger.consoleLogger.info("count of employees who has same name " + empWithSameNamesCount);

        //get the employees who has salaries greater than 20000

        List<Employee12> empSalariesGreaterThn20K = employeeList.stream().filter(emp -> emp.getSalary() > 20000)
                .collect(Collectors.toList());
        MyLogger.consoleLogger.info("Employees with salary>20K: " + empSalariesGreaterThn20K);
    }

}