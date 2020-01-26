package com.nisum.corejava.collectionsframework.CustomClassAsKeyInMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmapusing_CustomclassDemo {
    public static void main(String[] args) {
        Map<Integer, Student> map = new LinkedHashMap<Integer, Student>(10, 0.75f);
        Student stu1 = new Student(10, "Avinash");
        Student stu2 = new Student(20, "Manju");
        Student stu3 = new Student(30, "Rohit");
        Student stu4 = new Student(40, "Sankeerth");
        Student stu5 = new Student(50, "Akash");

        map.put(stu1.getRollNumber(), stu1);
        map.put(stu2.getRollNumber(), stu2);
        map.put(stu3.getRollNumber(), stu3);
        map.put(stu4.getRollNumber(), stu4);
        map.put(stu5.getRollNumber(), stu5);

        Iterator<Integer> iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            Student stu = map.get(iterator.next());
            stu.display();
        }
    }
}
