package com.java.rk.aggregration;

// Class representing Engine
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Class representing Car
class Car {
    private String model;
    private Engine engine; // Aggregation: Car HAS-A Engine

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Engine Type: " + engine.getType());
    }
}

// Main class to demonstrate Aggregation
public class AggregationExample {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car("Mustang", engine);

        car.displayDetails();
    }
}
