package com.java.rk.map;
import java.util.TreeMap;
import java.util.Comparator;

public class CustomTreeMapExample {
    public static void main(String[] args) {
        // Custom Comparator for descending order
        TreeMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        // Adding key-value pairs
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Displaying the TreeMap (custom sorted order)
        System.out.println("TreeMap (descending order): " + map);
    }
}
