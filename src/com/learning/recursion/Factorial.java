package com.learning.recursion;

import java.util.Scanner;

public class Factorial {

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");

        int number = scanner.nextInt();

        System.out.println("Factorial of " + number + ": " + calculateFactorial(number));

        scanner.close();

    }
}
