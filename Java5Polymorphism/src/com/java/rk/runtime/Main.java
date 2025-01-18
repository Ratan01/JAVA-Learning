package com.java.rk.runtime;

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound(); // Output: The dog barks.

        a = new Cat();
        a.sound(); // Output: The cat meows.
    }
}


