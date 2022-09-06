package com.learning.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

    public static int[] getNumberArray() throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of array");
        int length = Integer.parseInt(reader.readLine());

        int[] array = new int[length];

        System.out.println("Enter Numbers in Array");
        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        return array;

    }

    public static void printArray(int[] array) {
        System.out.println("Elements in Array are:");
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void swap(int[] array, int j, int k) {
        int temp = array[j];
        array[j] = array[k];
        array[k] = temp;

    }

    public static void sort(int[] input) {

        for (int lastSortedIndex = input.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int j = 0; j < lastSortedIndex; j++) {
                if (input[j] > input[j + 1]) {
                    swap(input, j, j + 1);
                }
            }
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        // Array Input [20, 35, -15, 7, 55, 1, -22]

        int[] array = getNumberArray();
        System.out.println("Input Array:");
        printArray(array);

        System.out.println("Sorted Array:");
        sort(array);
        printArray(array);

    }

}
