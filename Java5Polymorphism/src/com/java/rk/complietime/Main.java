package com.java.rk.complietime;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));       // Calls add(int, int)
        System.out.println(calc.add(5.5, 10.5));  // Calls add(double, double)
        System.out.println(calc.add(1, 2, 3));    // Calls add(int, int, int)
    }
}


