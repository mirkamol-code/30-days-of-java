package com.mirkamolcode.day_5;

import java.util.Scanner;

public class Exercise_1 {
    static void main() {
        // Challenge Description
        // Create a program that accepts a phone number in any format, validates it, and formats it as (XXX) XXX-XXXX if valid.
        // Instructions
        // Import java.util.Scanner
        // Prompt the user for a phone number
        // Strip all non-digit characters with replaceAll("[^0-9]", "")
        // Validate that the result has exactly 10 digits
        // If valid, format and print (XXX) XXX-XXXX; otherwise print an error

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Phone Number Formatter ===");
        System.out.print("Enter phone number: ");
        String inputPhoneNumber = scanner.nextLine();
        inputPhoneNumber.replaceAll("[^0-9]", "");
        int length = inputPhoneNumber.length();
        if (length != 10) {
            System.out.println("Error: Invalid phone number. Must be 10 digits.");
        } else {
            String firstThreeDigit = inputPhoneNumber.substring(0, 3);
            String nextThreeDigit = inputPhoneNumber.substring(3, 6);
            String lastThreeDigits = inputPhoneNumber.substring(6);

            String result = "Formatted: ";
            System.out.println(result
                    .concat("(")
                    .concat(firstThreeDigit)
                    .concat(")")
                    .concat(" ")
                    .concat(nextThreeDigit)
                    .concat("-")
                    .concat(lastThreeDigits));
            scanner.nextLine();
            scanner.close();
        }
    }


}

