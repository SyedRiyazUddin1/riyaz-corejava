package com.nisum.corejava.collectionsframework;

import java.util.Collections;
import java.util.Vector;
import java.util.logging.Logger;

import com.nisum.corejava.util.MyLogger;
import org.apache.log4j.BasicConfigurator;

public class CollectionsClassDemo {
    public static void main (String []args) {
    	Vector<Integer> num= new Vector<Integer>();
    	num.add(20);
    	num.add(50);
    	num.add(10);
    	num.add(30);
    	System.out.println(num);
    	//sorting the elements via below Collections class's method
    	Collections.sort(num);
    	System.out.println(num);
    	// binarSearch technique always work only after sorting.
    	// x will return the index of key (30)
    	int x = Collections.binarySearch(num, 30);
    	System.out.println(num);
    	System.out.println(x);
    	//with below swap method, we can swap the elements, here 1 and 3 are index numbers of the elements.
    	Collections.swap(num, 1, 3);
    	System.out.println(num);
    	
    	Collections.reverse(num); //can reverse the whole elements
    	System.out.println(num);

		MyLogger.consoleLogger.info("Log4j configured successfully");



    }
}
