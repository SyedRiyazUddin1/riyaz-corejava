package com.hibernate.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;


public class Employee {
    public static void main(String[] args) {
        EmployeeDemo1 employeeDemo1 = new EmployeeDemo1();
        employeeDemo1.setEmpId(101);
        employeeDemo1.setEmpName("Riyaz");
        employeeDemo1.setEmpDept("ES");

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeDemo1.class);

        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session= sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(employeeDemo1);


    }
}
