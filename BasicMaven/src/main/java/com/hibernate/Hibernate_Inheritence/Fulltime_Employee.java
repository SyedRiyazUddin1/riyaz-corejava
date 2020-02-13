package com.hibernate.Hibernate_Inheritence;

import com.hibernate.examples.Employee_;

public class Fulltime_Employee extends Employee_IT {
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    private int bonus;
}
