package com.javapractice.corejava.logicalprograms;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Program to print the similar elements
 */
public class CommonElementsInArrays {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL", "Java"};

        String[] array2 = {"MySQL", "SQL", "Oracle", "PostgreSQL", "DB2", "jAVA"};

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        Set<String> set = new HashSet<String>();

        for (int loop1 = 0; loop1 < array1.length; loop1++) {
            for (int loop2 = 0; loop2 < array2.length; loop2++) {
                if (array1[loop1].equals(array2[loop2])) {
                    set.add(array1[loop1]);
                }
            }
        }
        System.out.println("Common element : " + (set));

    }
}

