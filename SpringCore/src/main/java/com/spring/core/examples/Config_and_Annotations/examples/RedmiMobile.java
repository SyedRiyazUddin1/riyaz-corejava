package com.spring.core.examples.Config_and_Annotations.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


//when Component annotation is used, then there is no need to use the below config in xml file
//<bean id="redmiMobile" class="com.spring.examples.Config_and_Annotations.examplee***">
//however, we need to put the below config in the xml file
//<context:component-scan base-package="com.spring.examples"></context:component-scan>
@Component
public class RedmiMobile {

    @Autowired
            @Qualifier("mediatek") //instead of using primary annotation in the particular class, we can use qualifier and mention the  object name
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
