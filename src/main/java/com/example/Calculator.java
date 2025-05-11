  package com.example;  

public class Calculator {

    // Adds two integers
    public int add(int a, int b) {
        return a + b; 
    }

    // Subtracts b from a
    public int subtract(int a, int b) {
        return a - b;
    }

    // Main method to print "Hello World"
    public static void main(String[] args) {
        // Print Hello World
        System.out.println("This is a calculator");

        // Example usage of the Calculator class
        Calculator calculator = new Calculator();
        int sum = calculator.add(2, 3);
        System.out.println("2 + 3 = " + sum);
    }
}
