package com.mirkamolcode.day_4;

import java.util.Scanner;

public class Exercise_4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Compound Interest Calculator ===");

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter time period (years): ");
        double timePeriod = scanner.nextDouble();

        double finalAmount = principal * Math.pow(1 + annualInterestRate, timePeriod);
        double interestEarned = finalAmount - principal;

        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Interest Earned: $" + interestEarned);
        scanner.close();
    }
}
