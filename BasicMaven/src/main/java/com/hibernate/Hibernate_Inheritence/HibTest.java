package com.hibernate.Hibernate_Inheritence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibTest {

        public static void main(String[] args) {

            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            Employee_IT employee_it=new Employee_IT();
            employee_it.setName("Rohit");

            Fulltime_Employee fulltime_employee =new Fulltime_Employee();
            fulltime_employee.setName("Syed Riyaz");
            fulltime_employee.setSalary(50000);
            fulltime_employee.setBonus(5);

            Contract_Employee contract_employee=new Contract_Employee();
            contract_employee.setName("Avinash");
            contract_employee.setPay_per_hour(1000);
            contract_employee.setContract_duration("15 hours");

            session.persist(employee_it);
            session.persist(fulltime_employee);
            session.persist(contract_employee);

            session.getTransaction().commit();
            session.close();
            System.out.println("success");

        }
    }
