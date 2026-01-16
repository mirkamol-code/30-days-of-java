package com.mirkamolcode.day_3;

public class Exercise_1 {
    static void main() {
        String text = "Hello Java World";
        System.out.println("Original text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("First character: " + text.charAt(0) + " Last character: " + text.charAt(text.length()-1));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Starts with 'Hello': "+ text.startsWith("Hello"));
        System.out.println("Ends with World: " + text.endsWith("World"));

    }
}
