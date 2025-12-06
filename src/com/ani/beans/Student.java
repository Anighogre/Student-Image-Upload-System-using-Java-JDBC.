package com.ani.beans;

import java.io.InputStream;

public class Student 
{
	private String name;
	private int roll_Number;
	private String address;
	private InputStream inputstream;
	
	
	public Student()
	{
		
	}
	
	public Student(String name, int roll_Number, String address, InputStream inputstream) {
		super();
		this.name = name;
		this.roll_Number = roll_Number;
		this.address = address;
		this.inputstream = inputstream;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_Number() {
		return roll_Number;
	}

	public void setRoll_Number(int roll_Number) {
		this.roll_Number = roll_Number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public InputStream getInputstream() {
		return inputstream;
	}

	public void setInputstream(InputStream inputstream) {
		this.inputstream = inputstream;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_Number=" + roll_Number + ", address=" + address + ", inputstream="
				+ inputstream + "]";
	}
	
	
	
}
