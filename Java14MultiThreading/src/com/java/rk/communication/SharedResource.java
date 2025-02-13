package com.java.rk.communication;

class SharedResource {
    private boolean flag = false;

    public synchronized void produce() throws InterruptedException {
        while (flag) {
            wait();
        }
        System.out.println("Producing...");
        flag = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!flag) {
            wait();
        }
        System.out.println("Consuming...");
        flag = false;
        notify();
    }
}