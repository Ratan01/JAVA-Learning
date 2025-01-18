package com.java.rk.genrics;
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics!");
        System.out.println("String Content: " + stringBox.getContent());

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer Content: " + integerBox.getContent());
    }
}