package com.java.rk.queue;
import java.util.LinkedList;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        // Creating a LinkedList to act as a queue
        LinkedList<String> queue = new LinkedList<>();

        // Adding elements (FIFO behavior)
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        // Accessing the head of the queue
        System.out.println("Head of queue: " + queue.peek());

        // Removing elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        // Checking the size
        System.out.println("Size: " + queue.size());
    }
}
