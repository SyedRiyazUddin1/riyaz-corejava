package com.spring.examples.Config_and_Annotations.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class RedmiMobile {

    @Autowired
            @Qualifier("mediatek")
    MobileProcessor mobileProcessor;

    public MobileProcessor getMobileProcessor() {
        return mobileProcessor;
    }

    public void setMobileProcessor(MobileProcessor mobileProcessor) {
        this.mobileProcessor = mobileProcessor;
    }



    public void config() {

        System.out.println("OctaCore, 4GB Ram, 12 MP camera");
        mobileProcessor.process();
    }
}
