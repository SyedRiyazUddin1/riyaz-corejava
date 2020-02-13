//Program using Criteria API
package com.hibernate.hql_and_Criteria.examples;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Student_Criteria {

    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        //step 3: creating sessions from SessionFactory
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        //creating table
////        for (int loop=1;loop<=5;loop++){
//            Student student = new Student();
//            student.setRollNo(7);
//            student.setStudent_Name("name 4");
//            student.setStudent_branch("branch7");
//            session.save(student);
////        }

        //creating criteria objects needs to know for which table/entity we are imposing the restrictions
        Criteria criteria = session.createCriteria(Student.class);
//can add restrictions to the criteria and if we need all the records,then we must skip the below steps

        //when need one of the property/cloumn name (string 1) should be equals to the value we are specifying (string 2)
        criteria.add(Restrictions.eq("student_Name", "name 4"))
                //
                .add(Restrictions.gt("rollNo", 3))
                //similar names details can be retrieved
                .add(Restrictions.like("student_Name", "name 4"));


        List<Student> studentList = criteria.list();
        System.out.println(studentList);
        for (Student student1 : studentList) {
            System.out.println(student1);
        }

        session.getTransaction().commit();
        session.close();
    }
}
