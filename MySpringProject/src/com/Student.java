package com;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo(){
		System.out.println("Hi : " + name);
	}
	/*
	@Override
	public String toString(){
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/
}
