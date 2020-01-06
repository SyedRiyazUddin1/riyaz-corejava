package com.nisum.corejava.serialization;

import java.io.Serializable;

public class EmployeeDemo implements Serializable {
	public String name;
	public String address;
	public transient int aadhar; //using "transient" keyword helps to avoid saving the aadhar object (Confidential info)
	public int number;

	}

