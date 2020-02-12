package com.hibernate.one_to_one_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDetails_Main {

    public static void main(String[] args) {

        UserDetails userDetails = new UserDetails(102, "Rohit", "Andhra Pradesh");

        //step 2: Create sessions from sessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        //step 3: creating sessions from SessionFactory
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //step 4: saving the objects
        session.save(userDetails);
        session.getTransaction().commit();

        session.clear();
    }
}
