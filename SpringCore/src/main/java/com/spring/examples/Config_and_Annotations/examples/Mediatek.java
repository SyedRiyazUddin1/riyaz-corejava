package com.spring.examples.Config_and_Annotations.examples;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Mediatek implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("2nd smartest CPU");
    }
}
