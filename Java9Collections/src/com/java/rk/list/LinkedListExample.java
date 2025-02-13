package com.java.rk.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> cities = new LinkedList<>();

        // Adding elements
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");

        // Adding elements at specific positions
        cities.addFirst("San Francisco");
        cities.addLast("Houston");

        // Accessing elements
        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());

        // Updating elements
        cities.set(1, "Seattle");
        System.out.println("Updated list: " + cities);

        // Removing elements
        cities.remove("Houston");
        cities.removeFirst();
        System.out.println("After removal: " + cities);

        // Checking size
        System.out.println("Size: " + cities.size());
    }
}
