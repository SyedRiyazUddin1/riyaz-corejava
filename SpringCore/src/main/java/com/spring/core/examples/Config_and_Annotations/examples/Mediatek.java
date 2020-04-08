package com.spring.core.examples.Config_and_Annotations.examples;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //If two classes implments same interface and if there is any confusion in creating objects, then primary annotation specifies the particular object which needs to be created
public class Mediatek implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("2nd smartest CPU");
    }
}
