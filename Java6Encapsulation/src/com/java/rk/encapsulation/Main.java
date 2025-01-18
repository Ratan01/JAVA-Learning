package com.java.rk.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // Setting values through setter methods
        emp.setName("Alice");
        emp.setAge(30);
        emp.setSalary(50000);
        // Accessing values through getter methods
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
    }
}

