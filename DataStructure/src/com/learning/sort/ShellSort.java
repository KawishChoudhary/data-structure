package com.learning.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellSort {

    public static int[] getIntegerArray() throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter length of array");
        var length = Integer.parseInt(reader.readLine());

        int[] array = new int[length];

        System.out.println("Enter Numbers in Array");
        for (var i = 0; i < length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (var x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        for (var gap = array.length / 2; gap > 0; gap /= 2) {
            for (var unsortedIndex = gap; unsortedIndex < array.length; unsortedIndex++) {

                var element = array[unsortedIndex];
                var i = unsortedIndex;

                while (i >= gap && array[i - gap] > element) {
                    array[i] = array[i - gap];
                    i -= gap;
                }

                array[i] = element;

            }

        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        // Array Sample Input [20, 35, -15, 7, 55, 1, -22]

        int[] array = getIntegerArray();
        System.out.println("Unsorted Array");
        printArray(array);

        System.out.println("Sorted Array");
        sort(array);
        printArray(array);

    }

}
