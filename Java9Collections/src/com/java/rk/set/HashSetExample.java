package com.java.rk.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element, will not be added

        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Checking for an element
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Removing an element
        set.remove("Cherry");
        System.out.println("After removal: " + set);

        // Iterating through the HashSet
        System.out.println("Iterating through HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Checking the size
        System.out.println("Size: " + set.size());

        // Clearing the HashSet
        set.clear();
        System.out.println("Is HashSet empty? " + set.isEmpty());
    }
}
