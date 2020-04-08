package com.spring.core.examples.dependency_InjectionDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {

    public static void main(String[] args) {

//        SimCard simCard = new Iphone();
//        simCard.calling();
//        simCard.data();

        //This Class should be configurable without changing the source code
        //We are not going to create objects now, spring IOC can create objects for us

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Config loaded");

       // Samsung air = (Samsung) applicationContext.getBean("airtel");
        //instead of typecasting, we can also mention the class name inside getBean method
//        Samsung air = applicationContext.getBean("airtel",Samsung.class);
//        air.calling();
//        air.data();

        //This class should be configurable without changing the source code, just change the class name in bean.xml
        //SimCard simCard = applicationContext.getBean("simCard", SimCard.class);

        //Annotation based configuration

        SimCard simCard = (SimCard) applicationContext.getBean("airtel");
        SimCard simCard1 = (SimCard) applicationContext.getBean("jio");

        simCard.calling();
        simCard.data();

        simCard1.calling();
        simCard1.data();

        Speaker speaker = (Speaker) applicationContext.getBean("speaker");
        System.out.println(speaker);


    }
}
