package com.java.rk.map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> map = new TreeMap<>();

        // Adding key-value pairs
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Displaying the TreeMap (sorted order of keys)
        System.out.println("TreeMap: " + map);

        // Accessing values
        System.out.println("Value for Bob: " + map.get("Bob"));

        // Navigating keys
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("Higher Key than 'Alice': " + map.higherKey("Alice"));

        // Removing a key
        map.remove("Alice");
        System.out.println("After removal: " + map);
    }
}
