package com.spring.examples.Config_and_Annotations.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan(basePackages = "com.spring.examples.Config_and_Annotations.examples")

public class AppConfiguration {

//    @Bean
//    public RedmiMobile getPhone(){
//        return new RedmiMobile();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor(){
//        return new Snapdragon();
//        }

//    No need to create beans above if we use @ComponentScan and @primary annotations
    //we can also write @Qualifier("snapdragon") annotation in the RedmiMobile class below @Autowired annotation, if we don't want to go with @Primary annotation


    }

