package com.java.rk.lambda;


public class LambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        });
        thread.start();
    }
}
