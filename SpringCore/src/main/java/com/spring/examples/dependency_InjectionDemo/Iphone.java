package com.spring.examples.dependency_InjectionDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Iphone implements SimCard{

    @Autowired
    private Speaker speaker;

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }


    @Override
    public void calling() {
        System.out.println("Calling using Iphone mobile \n" + speaker);

    }

    @Override
    public void data() {
        System.out.println("Browsing internet using Iphone mobile");

    }
}
