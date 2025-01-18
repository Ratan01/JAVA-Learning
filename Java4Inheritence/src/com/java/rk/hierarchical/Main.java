package com.java.rk.hierarchical;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat(); // Inherited from Animal
        dog.bark(); // Specific to Dog

        cat.eat(); // Inherited from Animal
        cat.meow(); // Specific to Cat
    }
}

