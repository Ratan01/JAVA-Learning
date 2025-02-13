package com.java.rk.map;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Adding key-value pairs
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Displaying the map
        System.out.println("LinkedHashMap: " + map);

        // Accessing elements
        System.out.println("Value for Bob: " + map.get("Bob"));

        // Removing an element
        map.remove("Alice");
        System.out.println("After removal: " + map);
    }
}
