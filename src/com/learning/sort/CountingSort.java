package com.learning.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSort {
	
	public static int[] getIntegerArray() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter length of array");
		int length = Integer.parseInt(reader.readLine());
		
		int[] array = new int[length];
		
		System.out.println("Enter numbers in array");
		for(int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}
		
		return array;
	}
	
	public static void printArray(int[] array) {
		System.out.println("Numbers in array are:");
		for(int x : array) {
			System.out.println(x);
		}
	}
	
	public static void countingSort(int[] input, int minValue, int maxValue) {
		
		// Create counting Array
		int[] countingArray = new int[maxValue - minValue + 1];
		for(var x : input) {
			countingArray[x-minValue]++;
			
		}
		
		// Place Values back to input array
		int j = 0;
		for(int i = minValue; i <= maxValue; i++) {
			
			while(countingArray[i-minValue] > 0) {
				
				input[j++] = i;
				countingArray[i-minValue] --;
				
			}
			
		}
		
	}
	
	public static int getMinValue(int[] array) {
		int minvalue = Integer.MAX_VALUE;
		
		for(var x : array) {
			if (x < minvalue) {
				minvalue = x;
			}
		}
		
		return minvalue;
	}
	
	public static int getMaxValue(int[] array) {
		int maxvalue = Integer.MIN_VALUE;
		
		for(var x : array) {
			if (x > maxvalue) {
				maxvalue = x;
			}
		}
		
		return maxvalue;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Array Input [20, 8, 2, 8, 7, 10, 4, 3, 15, 2]

        int[] array = getIntegerArray();
        System.out.println("Input Array:");
        printArray(array);

        System.out.println("Sorted Array:");
        countingSort(array, getMinValue(array), getMaxValue(array));
        printArray(array);
		
	}

}
