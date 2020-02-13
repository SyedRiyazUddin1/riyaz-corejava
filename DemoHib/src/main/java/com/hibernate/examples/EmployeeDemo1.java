package com.hibernate.examples;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDemo1 {

    @Id
    private int empId;
    private String empName;
    private String empDept;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }
}

