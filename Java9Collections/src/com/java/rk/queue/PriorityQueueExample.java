package com.java.rk.queue;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Accessing the head of the queue
        System.out.println("Head of queue: " + pq.peek());

        // Removing elements
        System.out.println("Removed element: " + pq.poll());
        System.out.println("PriorityQueue after removal: " + pq);

        // Checking the size
        System.out.println("Size: " + pq.size());
    }
}
