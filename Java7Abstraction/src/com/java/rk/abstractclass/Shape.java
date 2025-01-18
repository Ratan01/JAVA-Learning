package com.java.rk.abstractclass;

abstract class Shape {
	// Abstract method (no body)
    abstract void draw();

    // Concrete method (with body)
    void display() {
        System.out.println("This is a shape.");
    }

}
