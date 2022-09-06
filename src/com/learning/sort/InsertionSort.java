package com.learning.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {

    public static int[] getIntegerArray() throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of array");
        final var length = Integer.parseInt(reader.readLine());
        int[] array = new int[length];

        System.out.println("Enter Number in array");
        for (var i = 0; i < length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        return array;

    }

    public static void printArray(int[] array) {

        System.out.println("Numbers in Array are:");
        for (var x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        for (var unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
            var element = array[unsortedIndex];
            var i = unsortedIndex;
            while (i >= 1 && array[i - 1] > element) {
                array[i] = array[i - 1];
                i--;
            }
            array[i] = element;
        }

    }

    public static void main(final String[] args) throws NumberFormatException, IOException {

        // Array Sample Input [20, 35, -15, 7, 55, 1, -22]
        int[] array = getIntegerArray();
        System.out.println("Input Array");
        printArray(array);

        System.out.println("Sorted Array:");
        sort(array);
        printArray(array);

    }

}
