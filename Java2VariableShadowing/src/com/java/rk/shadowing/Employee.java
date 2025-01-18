package com.java.rk.shadowing;

public class Employee {
	String name="Rajesh";
	int age=23;
	
	public void display() {
		String name="Ramesh";
		int age = 27;
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Name: "+this.name);    /// Avoiding the variable shadowing using this keyword
		System.out.println("Age: "+this.age);      /// Avoiding the variable shadowing using this keyword
	}
	 public static void main(String[] args) {
		Employee e=new Employee();
		e.display();
	}
}
