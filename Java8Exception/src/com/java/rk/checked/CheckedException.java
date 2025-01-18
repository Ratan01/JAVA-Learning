package com.java.rk.checked;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try {
              FileReader reader = new FileReader("file.txt");                  // Checked exception
         } catch (FileNotFoundException e) {
               System.out.println("File not found!");
         }
    }

}
