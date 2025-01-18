package com.java.rk.wrapper;
public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing: Converting a primitive to a wrapper object
        Integer num = 10;
        System.out.println("Wrapper Integer: " + num);

        // Unboxing: Converting a wrapper object to a primitive
        int primitiveNum = num;
        System.out.println("Primitive int: " + primitiveNum);
    }
}
