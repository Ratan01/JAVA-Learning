package com.java.rk.string;
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Java");
        sb.insert(11, " Programming");
        sb.replace(0, 7, "Hello");
        sb.delete(5, 11);
        System.out.println(sb); // Output: Hello Programming
    }
}
