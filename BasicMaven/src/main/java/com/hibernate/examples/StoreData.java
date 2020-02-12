//CRUD Operations in Hibernate
package com.hibernate.examples;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;


public class StoreData {
    public static void main(String[] args) {

        //step 1: Instantiate the object of Model class and set the values
        Employee employee;
        //employee = new Employee(117, "Zeeshan", "Khan");


        //step 2: Create sessions from sessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        //step 3: creating sessions from SessionFactory
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //step 4: saving the objects
        //session.save(employee);

        System.out.println("***Successfully saved***");

        //Retrieving/Reading objects using session get
        employee = (Employee) session.get(Employee.class, 102);
        System.out.println("Employee details retrieved is " + employee.getFirstName());

        //Deleting objects from table
        employee = (Employee) session.get(Employee.class, 115);
        session.delete(employee);
        System.out.println("Deleted successfully");
        session.getTransaction().commit();

    }
}