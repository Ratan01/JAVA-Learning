package com.java.rk.set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(30);

        // Displaying the TreeSet (sorted order)
        System.out.println("TreeSet: " + set);

        // Accessing first and last elements
        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());

        // Navigating elements
        System.out.println("Higher than 20: " + set.higher(20));
        System.out.println("Lower than 20: " + set.lower(20));
        System.out.println("Ceiling of 25: " + set.ceiling(25));
        System.out.println("Floor of 25: " + set.floor(25));

        // Removing an element
        set.remove(20);
        System.out.println("After removal: " + set);

        // Checking size and emptiness
        System.out.println("Size: " + set.size());
        System.out.println("Is TreeSet empty? " + set.isEmpty());
    }
}
