package com.hibernate.hql_and_Criteria.examples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", student_Name='" + student_Name + '\'' +
                ", student_branch='" + student_branch + '\'' +
                '}';
    }

    @Id
    private int rollNo;
@Column
    private String student_Name, student_branch;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public String getStudent_branch() {
        return student_branch;
    }

    public void setStudent_branch(String student_branch) {
        this.student_branch = student_branch;
    }
}
