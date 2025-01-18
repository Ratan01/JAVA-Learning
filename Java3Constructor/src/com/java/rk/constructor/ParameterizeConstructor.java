package com.java.rk.constructor;

public class ParameterizeConstructor {
	int price;
	String color;
	
	// custom or parameterize constructor
	public ParameterizeConstructor(int p, String c) {
		price=p;
		color=c;
	}
	
	public static void main(String[] args) {
		ParameterizeConstructor p1 = new ParameterizeConstructor(1400, "Blue");
		ParameterizeConstructor p2 = new ParameterizeConstructor(2300, "Black");
		
		System.out.println(p1.price);
		System.out.println(p1.color);
		System.err.println(p2.price);
		System.out.println(p2.color);
	}

}
