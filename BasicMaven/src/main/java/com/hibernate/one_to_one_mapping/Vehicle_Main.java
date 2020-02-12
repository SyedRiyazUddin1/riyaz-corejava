package com.hibernate.one_to_one_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Vehicle_Main {

        public static void main(String[] args) {

            Vehicle vehicle = new Vehicle(1003,"Ferrari");

            //step 2: Create sessions from sessionFactory
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

            //step 3: creating sessions from SessionFactory
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            //step 4: saving the objects
            session.save(vehicle);
            session.getTransaction().commit();

            session.clear();
        }
    }
