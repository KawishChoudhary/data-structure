package com.learning.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {

	public static int[] getIntegerArray() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter length of Array");
		int length = Integer.parseInt(reader.readLine());
		
		int[] array = new int[length];
		
		System.out.println("Enter numbers in array");
		for(int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}
		
		return array;
		
	}
	
	public static void printArray(int[] array) {
		System.out.println("Number in array");
		for(int x : array) {
			System.out.println(x);
		}
	}
	
	public static void sort(int[] array, int start, int end) {
		
		if(end-start < 2) {
			return;
		}
		int pivotIndex = partition(array, start, end); 
		sort(array, start, pivotIndex);
		sort(array, pivotIndex + 1, end);
	}
	
	private static int partition(int[] array, int start, int end) {
		int pivot = array[start];
		int i = start;
		int j = end;
		
		while(i < j) {
			while(i < j && array[--j] >= pivot);
			if(i < j) array[i] = array[j];
			
			while(i < j && array[++i] <= pivot);
			if(i < j) array[j] = array [i];
			
		}
		array[j] = pivot;
		return j;
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		  // Array Sample Input [20, 35, -15, 7, 55, 1, -22]
        int[] array = getIntegerArray();
        System.out.println("Input Array");
        printArray(array);

        System.out.println("Sorted Array:");
        sort(array, 0, array.length);
        printArray(array);
		
	}

}
