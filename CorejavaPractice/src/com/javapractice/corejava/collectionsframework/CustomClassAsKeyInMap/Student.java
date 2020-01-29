package com.javapractice.corejava.collectionsframework.CustomClassAsKeyInMap;

public class Student {
    private int stu_rollNumber;
    private String stu_name;

    public Student(int rollNumber, String name) {
        this.stu_rollNumber = rollNumber;
        this.stu_name = name;
    }

    public int getRollNumber() {
        return stu_rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.stu_rollNumber = rollNumber;
    }

    public String getName() {
        return stu_name;
    }

    public void setName(String name) {
        this.stu_name = name;
    }
    public void display(){
        System.out.println("Rollnumber: "+getRollNumber()+" Name: "+getName());
    }
}
