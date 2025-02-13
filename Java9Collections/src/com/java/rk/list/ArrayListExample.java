package com.java.rk.list;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		// Create an ArrayList
		ArrayList<String> fruits = new ArrayList<>();

		// Add elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");

		// Access elements
		System.out.println("First fruit: " + fruits.get(0));

		// Update an element
		fruits.set(1, "Blueberry");

		// Remove an element
		fruits.remove("Cherry");

		// Check size
		System.out.println("Number of fruits: " + fruits.size());

		// Iterate through the list
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
