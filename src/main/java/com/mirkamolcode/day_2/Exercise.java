package com.mirkamolcode.day_2;

public class Exercise {
    static void main() {
        /**
         * create a program that calculates
         * the area and perimeter of a rectangle using variables
         * and basic arithmetic operations.
         *
         */
        double length = 10.0;
        double width = 5.0;
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Rectangle Calculator");
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
    }
}
