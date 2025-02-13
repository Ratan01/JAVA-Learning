package com.java.rk.map;
import java.util.LinkedHashMap;
import java.util.Map;

public class AccessOrderExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap with access order
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(16, 0.75f, true);

        // Adding key-value pairs
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Accessing elements
        map.get("Alice");
        map.get("Charlie");

        // Displaying the map
        System.out.println("LinkedHashMap (access order): " + map);
    }
}
