package com.java.rk.queue;
import java.util.LinkedList;

public class LinkedListAsDeque {
    public static void main(String[] args) {
        // Creating a LinkedList to act as a deque
        LinkedList<String> deque = new LinkedList<>();

        // Adding elements to both ends
        deque.addFirst("Alice");
        deque.addLast("Bob");
        deque.addLast("Charlie");
        deque.addFirst("David");

        // Displaying the deque
        System.out.println("Deque: " + deque);

        // Removing elements from both ends
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);
    }
}
