package com.java.rk.checked;

public class UncheckedException {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);          // Throws ArrayIndexOutOfBoundsException
    }

}
