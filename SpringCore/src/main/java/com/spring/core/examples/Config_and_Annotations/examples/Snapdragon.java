package com.spring.core.examples.Config_and_Annotations.examples;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Snapdragon implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("World's smartest CPU");
    }
}
