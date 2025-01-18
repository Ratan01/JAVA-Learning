package com.java.rk.multilevel;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();    // From Animal class
        dog.breathe(); // From Mammal class
        dog.bark();    // From Dog class
    }
}

