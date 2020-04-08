package com.spring.core.examples.dependency_InjectionDemo;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements SimCard{

////    public Samsung(){
//        System.out.println("Samsung constructor called");
//    }
    @Override
    public void calling() {
        System.out.println("Calling using Samsung mobile");

    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Samsung mobile");

    }
}
