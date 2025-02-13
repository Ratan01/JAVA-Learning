package com.java.rk.encapsulation;

public class Employee {
	// Private fields (data hiding)
	private String name;
	private int age;
	private double salary;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0) { // Input validation
			this.age = age;
		} else {
			System.out.println("Age must be positive.");
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary > 0) { // Input validation
			this.salary = salary;
		} else {
			System.out.println("Salary must be positive.");
		}
	}
}


