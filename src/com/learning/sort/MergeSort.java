package com.learning.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort {

    public static int[] getIntegerArray() throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter legth of array");
        int length = Integer.parseInt(reader.readLine());
        int[] array = new int[length];

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

    public static void partition(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (end + start) / 2;

        partition(array, start, mid);
        partition(array, mid, end);
        merge(array, start, mid, end);

    }

    private static void merge(int[] array, int start, int mid, int end) {

        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        // temporary array
        int[] temp = new int[end - start];

        while (i < mid && j < end) {

            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];

        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        // Array Sample Input [20, 35, -15, 7, 55, 1, -22]
        int[] array = getIntegerArray();
        System.out.println("Input Array");
        printArray(array);

        System.out.println("Sorted Array:");
        partition(array, 0, array.length);
        printArray(array);

    }

}
