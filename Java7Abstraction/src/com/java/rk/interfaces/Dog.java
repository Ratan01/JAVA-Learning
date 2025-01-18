package com.java.rk.interfaces;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The dog eats.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog sleeps.");
    }
}

