package com.java.rk.list;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> languages = new Vector<>();

        // Adding elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // Accessing elements
        System.out.println("First language: " + languages.firstElement());
        System.out.println("Last language: " + languages.lastElement());

        // Updating elements
        languages.set(1, "JavaScript");
        System.out.println("Updated Vector: " + languages);

        // Removing elements
        languages.remove("C++");
        System.out.println("After removal: " + languages);

        // Checking size and capacity
        System.out.println("Size: " + languages.size());
        System.out.println("Capacity: " + languages.capacity());

        // Adding more elements to exceed initial capacity
        languages.add("Ruby");
        languages.add("PHP");
        System.out.println("New Vector: " + languages);
        System.out.println("New Capacity: " + languages.capacity());
    }
}
