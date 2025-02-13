package com.java.rk.map;
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, Integer> table = new Hashtable<>();

        // Adding key-value pairs
        table.put("Alice", 30);
        table.put("Bob", 25);
        table.put("Charlie", 35);

        // Accessing values
        System.out.println("Value for Alice: " + table.get("Alice"));

        // Checking key and value existence
        System.out.println("Contains key 'Bob': " + table.containsKey("Bob"));
        System.out.println("Contains value 35: " + table.containsValue(35));

        // Removing an entry
        table.remove("Bob");
        System.out.println("After removal: " + table);

        // Iterating through the Hashtable
        System.out.println("Entries in the Hashtable:");
        for (String key : table.keySet()) {
            System.out.println(key + ": " + table.get(key));
        }
    }
}
