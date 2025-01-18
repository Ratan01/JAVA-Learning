package com.java.rk.multiple;

public class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("The dog eats.");
    }

    public void play() {
        System.out.println("The dog plays.");
    }
}

