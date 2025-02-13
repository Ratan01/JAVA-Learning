package com.java.rk.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(() -> System.out.println("Task 1 running"));
        executor.execute(() -> System.out.println("Task 2 running"));

        executor.shutdown();
    }
}
