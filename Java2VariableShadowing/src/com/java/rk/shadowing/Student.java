package com.java.rk.shadowing;

public class Student {
	String name="Rajesh";            
	int age=23;
	
	public void display() {
		String name="Ramesh";     /// variable shadowing
		int age = 27;              /// variable shadowing
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	 public static void main(String[] args) {
		Student s= new Student();
		s.display();
	}
}
