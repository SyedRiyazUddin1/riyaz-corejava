package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    String empName;
    int empId;
    double empSalary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    Employee(String empName, int empId, double empSalary) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", empSalary=" + empSalary +
                '}';
    }
}

public class SalaryIncrementDemo {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Syed Riyaz", 101, 15000));
        empList.add(new Employee("Avinash Edamadakala", 102, 11000));
        empList.add(new Employee("Rohit Mudunuri", 103, 8000));
        empList.add(new Employee("Zeeshan Khan", 104, 7000));
        MyLogger.consoleLogger.info(empList);

        List<Employee> newListWithUpdatedSalary =
                empList.stream().map(emp -> {
                    emp.setEmpSalary(emp.getEmpSalary() +4000); //adding 4000 to the salaries of all the employies
                    return emp;
                }).collect(Collectors.toList());
        MyLogger.consoleLogger.info(newListWithUpdatedSalary);

    }
}
