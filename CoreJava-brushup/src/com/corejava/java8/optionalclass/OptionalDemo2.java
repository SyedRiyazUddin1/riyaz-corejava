package com.corejava.java8.optionalclass;

import com.corejava.util.MyLogger;

import java.util.Optional;

public class OptionalDemo2 {

    public static void main(String[] args) {

        String[] str = new String[5];

        str[0] = "riyaz";
        str[1] = "syed";

//        MyLogger.consoleLogger.info(str[0].toUpperCase());
////        MyLogger.consoleLogger.info(str[2].toUpperCase());

        //when value is present
        Optional<String> optional = Optional.ofNullable(str[1]);
        if (optional.isPresent()) {
            MyLogger.consoleLogger.info
                    ("Value is Present: " + optional.get() + " Uppercasing :" + optional.get().toUpperCase());
        }

        //when value is Not present
        Optional<String> optional1 = Optional.ofNullable(str[2]);
        MyLogger.consoleLogger.info(optional1);

        if (optional1.isPresent()) // It Checks, value is present or not
        {
            MyLogger.consoleLogger.info
                    ("Value is Present: " + optional1.get() + " Uppercasing :" + optional1.get().toUpperCase());
        } else {
            MyLogger.consoleLogger.info("Value is not present");
        }

        optional1.ifPresent(System.out::println);   // printing value by using method reference
//        System.out.println(optional1.get());    // printing value by using get method


        // It returns true if value is present, otherwise false
        System.out.println("Is value present: " + optional1.isPresent());


        // It returns non-empty Optional if value is present, otherwise returns an empty Optional
        System.out.println("Nullable Optional: " + Optional.ofNullable(str[1]));

        // It returns value if available, otherwise returns specified value,
        System.out.println("orElse: " + optional1.orElse("Value is not present"));
        System.out.println("orElse: " + optional.orElse("Value is not present"));


        // printing value by using method reference
        optional.ifPresent(System.out::println);
        optional1.ifPresent(System.out::println);



}
}
