package com.java.rk.constructor;

public class ConstructorChaining {
    int x;
    String y;

    public ConstructorChaining() {
        this(10, "Default"); // Calls the parameterized constructor
    }

    public ConstructorChaining(int x, String y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
        obj.display(); // Output: x: 10, y: Default
    }
}
