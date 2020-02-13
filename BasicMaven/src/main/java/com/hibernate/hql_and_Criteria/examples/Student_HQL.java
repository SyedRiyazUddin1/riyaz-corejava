//Program using HQL
package com.hibernate.hql_and_Criteria.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Student_HQL {
    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        //step 3: creating sessions from SessionFactory
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        //creating table
//        for (int loop=1;loop<=5;loop++){
//            Student student = new Student();
//            student.setRollNo(loop);
//            student.setStudent_Name("name " +loop);
//            student.setStudent_branch("branch" +loop);
//            session.save(student);
//        }

        //Retrieving the Student table
        Query query = session.createQuery("from Student"); //using Query interface
        List<Student> studentList = query.list();
        for (Student student : studentList) {
            System.out.println(student);
        }

        //Retrieving details with rollNo
        Query query1 = session.createQuery("from Student where rollNo=4");
        Student student = (Student) query1.uniqueResult();
        System.out.println(student);

        //
        System.out.println("get records with pagination");
        Query query2 = session.createQuery("FROM Student");
        query2.setFirstResult(3);
        query2.setMaxResults(5);
        List<Student> studentList1 = query.list(); //will return the records from 3 to 5 number
        for (Student student1 : studentList) {
            System.out.println(student1);
        }


        session.getTransaction().commit();
        session.close();
    }
}
