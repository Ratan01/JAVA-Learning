package com.java.rk.queue;
import java.util.ArrayDeque;

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<String> stack = new ArrayDeque<>();

        // Adding elements (LIFO behavior)
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");

        // Accessing and removing elements
        System.out.println("Top of stack: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
