/*************************************************
 * Created by Antonio Marrero Bonilla      
 * Date: 3/27/2018                         
 * Revature Week 1 Java Core Assignments   
 * Subject: Bubble Sort an Array using bubbleSort
 * Question: Q1. Perform a bubble sort on the 
 * following integer array:  1,0,5,6,3,2,3,7,9,8,4
**************************************************/

package com.revature.corejavaassignment;

public class Q1BubbleSortNumbers {

	public static void main(String[] args) {
		// declare the array.
		int arr[] = {1,0,5,6,3,2,3,7,9,8,4};
						
		// Sort the array using bubbleSort method.
		bubbleSort(arr);
		// Display the Array
		displayArray(arr);

	}// end of main method
			
	public static void bubbleSort(int[] arr) {
				
		// number of items that will be sorted.
		int n = arr.length;
		// Holds the temporary values.
		int temp = 0;
				
		// The for loops that will check if the number is
		// bigger than the number next to it make a swap.
		// It will continue to make swap until no more swaps
		// are need it.
		for(int i = 0; i < n; i++) {
			for (int j = 1; j < (n-i); j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}// end of if
			}// end for
		}// end for
	}// end of bubbleSort method
	
	public static void displayArray(int arr[]) {
		// Prints out the string "Sorted Array" and the sorted array values.
		System.out.println("Sorted array:" + "\n");
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + "");
			}// end of for loop
	}// end displayArray

}// end of class
