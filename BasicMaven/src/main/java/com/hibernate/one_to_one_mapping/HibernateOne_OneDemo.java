package com.hibernate.one_to_one_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateOne_OneDemo {

        public static void main(String[] args) {

            UserDetails userDetails = new UserDetails(101,"Riyaz","Hyderabad");


            Vehicle vehicle = new Vehicle(1001,"Lamborghini");
            Vehicle vehicle2 = new Vehicle(1002,"Ferrari");

            //mapping between userDetails and Vehicle
            //userDetails.setVehicle(vehicle);

            //one to many mapping
            userDetails.getVehicle().add(vehicle);
            userDetails.getVehicle().add(vehicle2);


            //step 2: Create sessions from sessionFactory
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

            //step 3: creating sessions from SessionFactory
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            //step 4: saving the objects
            session.save(vehicle);
            session.save(vehicle2);
            session.save(userDetails);
            session.getTransaction().commit();

            session.clear();
        }
    }

