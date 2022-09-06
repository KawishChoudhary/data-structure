package com.learning.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {

    public static int[] getIntegerArray() throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of array");
        int length = Integer.parseInt(reader.readLine());

        int[] array = new int[length];

        System.out.println("Enter numbers in array");
        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Numbers in array are:");
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largestPosition = 0;
            for (int i = 1; i <= lastSortedIndex; i++) {
                if (array[i] > array[largestPosition]) {
                    largestPosition = i;
                }
            }
            swap(array, largestPosition, lastSortedIndex);
        }

    }

    public static void swap(int[] array, int j, int k) {
        int temp = array[j];
        array[j] = array[k];
        array[k] = temp;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        // Array Sample Input [20, 35, -15, 7, 55, 1, -22]

        int[] array = getIntegerArray();
        System.out.println("Unsorted Array:");
        printArray(array);

        System.out.println("Sorted Arra:");
        sort(array);
        printArray(array);

    }

}
