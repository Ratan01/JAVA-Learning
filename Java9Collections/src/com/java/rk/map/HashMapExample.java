package com.java.rk.map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Accessing values
        System.out.println("Value for Alice: " + map.get("Alice"));

        // Updating a value
        map.put("Alice", 31);
        System.out.println("Updated value for Alice: " + map.get("Alice"));

        // Checking key and value existence
        System.out.println("Contains key 'Bob': " + map.containsKey("Bob"));
        System.out.println("Contains value 35: " + map.containsValue(35));

        // Removing a key
        map.remove("Bob");
        System.out.println("Map after removal: " + map);

        // Iterating through the map
        System.out.println("Entries in the map:");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
