package com.spring.examples.Config_and_Annotations.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/// Spring core annotations

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

        RedmiMobile mi7 = applicationContext.getBean(RedmiMobile.class);
        mi7.config();
    }
}
