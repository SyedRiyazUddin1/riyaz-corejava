package com.spring.examples.dependency_InjectionDemo;

//autowired example
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredDemo {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Iphone iphone = (Iphone)applicationContext.getBean("iphone");

        //by calling iphone method, autowired annotated Speaker object will also get invoked
        iphone.calling();


    }
}
