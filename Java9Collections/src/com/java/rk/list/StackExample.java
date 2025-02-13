package com.java.rk.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Displaying the stack
        System.out.println("Stack: " + stack);

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Searching for an element
        System.out.println("Position of 'Java': " + stack.search("Java"));

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.empty());
    }
}
