package com.java.rk.set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element, will not be added

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + set);

        // Checking for an element
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Removing an element
        set.remove("Cherry");
        System.out.println("After removal: " + set);

        // Iterating through the LinkedHashSet
        System.out.println("Iterating through LinkedHashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Checking the size
        System.out.println("Size: " + set.size());

        // Clearing the LinkedHashSet
        set.clear();
        System.out.println("Is LinkedHashSet empty? " + set.isEmpty());
    }
}
