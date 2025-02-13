package com.java.rk.queue;
import java.util.ArrayDeque;

public class ArrayDequeAsQueue {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<String> queue = new ArrayDeque<>();

        // Adding elements (FIFO behavior)
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        // Accessing and removing elements
        System.out.println("Head of queue: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}
