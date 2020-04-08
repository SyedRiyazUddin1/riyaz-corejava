package com.spring.aop.examples;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//Aspect oriented Programming
//Cross cutting concerns ->@Aspect

//Advice (term in spring AOP) which simply means -> What/When you can plug-in AOP aspect ->@Before/@After
//PointCut (term in spring AOP) which simply means-> where you can plug-in AOP aspect

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {


    //Before annotation is used to run a method before the mentioned method name in the brackets)
    @Before("execution(public void show())")
    public void log() {
        System.out.println("maintaining log files...");
    }

    //Before annotation is used to run a method before the mentioned method name in the brackets)
    @After("execution (public void show())")
    public void Closure() {
        System.out.println("Closing the resources successfully...");
    }

}
