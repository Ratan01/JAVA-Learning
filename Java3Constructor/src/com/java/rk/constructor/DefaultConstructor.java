package com.java.rk.constructor;

public class DefaultConstructor {
	int price;
	String color;
	
	/*
	 * Its generate by compiler 
	 * its non-parameterized
	 * 
	 * public DefaultConstructor() {
	 * 
	 * }
	 */
	
	
	public static void main(String[] args) {
		DefaultConstructor d= new DefaultConstructor();
		d.price=1500;
		System.out.println(d.price);
	}
}
