package com.java.rk.checked;

import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that declares it may throw IOException
    public static void readFile() throws IOException {
        FileReader reader = new FileReader("example.txt");
        reader.close();
    }
}

