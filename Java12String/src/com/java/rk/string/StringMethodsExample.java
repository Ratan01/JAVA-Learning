package com.java.rk.string;
public class StringMethodsExample {
    public static void main(String[] args) {
        // 1. Creating Strings
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        // 2. Getting length
        System.out.println("Length of str1: " + str1.length());

        // 3. Character at specific index
        System.out.println("Character at index 7 in str1: " + str1.charAt(7));

        // 4. Substring
        System.out.println("Substring from str1: " + str1.substring(7, 12));

        // 5. Concatenate Strings
        System.out.println("Concatenated String: " + str1.concat(" Let's learn Java."));

        // 6. Contains
        System.out.println("Does str1 contain 'World'? " + str1.contains("World"));

        // 7. Replace
        System.out.println("Replacing 'World' with 'Java': " + str1.replace("World", "Java"));

        // 8. Convert to Upper and Lower Case
        System.out.println("Uppercase str2: " + str2.toUpperCase());
        System.out.println("Lowercase str2: " + str2.toLowerCase());

        // 9. Trim Whitespaces
        String str3 = "   Trimmed String   ";
        System.out.println("Before Trim: '" + str3 + "'");
        System.out.println("After Trim: '" + str3.trim() + "'");

        // 10. Split String
        String str4 = "Apple,Banana,Cherry";
        String[] fruits = str4.split(",");
        System.out.println("Split str4 into:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 11. Equality Check
        System.out.println("Is str1 equal to str2? " + str1.equals(str2));
        System.out.println("Is str1 equal to 'hello, world!' ignoring case? " +
                           str1.equalsIgnoreCase("hello, world!"));

        // 12. Index Of
        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));
        System.out.println("Last Index of 'o' in str1: " + str1.lastIndexOf('o'));

        // 13. Is Empty
        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());

        // 14. Value of
        int number = 123;
        String numberStr = String.valueOf(number);
        System.out.println("String value of number: " + numberStr);

        // 15. Starts With and Ends With
        System.out.println("Does str1 start with 'Hello'? " + str1.startsWith("Hello"));
        System.out.println("Does str1 end with '!'? " + str1.endsWith("!"));
    }
}
