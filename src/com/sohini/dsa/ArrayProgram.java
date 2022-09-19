package com.sohini.dsa;

import java.util.Arrays;

public class ArrayProgram {

	public static void main(String[] args) {
	
		int [] arr = new int [] {5,7,13,1,6};
		int findmax = findmax(arr);
		System.out.println( findmax);
		
		System.out.println(findMin(arr));
		//System.out.println(findmaxIndex(arr));
		
		  selectionSort(arr);
		  System.out.println(Arrays.toString(arr));
		 
		

	}

	//{5,7,13,1,6};
	  private static void selectionSort(int[] arr) 
	  { 
		  for (int i = 0; i <arr.length; i++) {
			  int index = findmaxIndex(arr,i); 

			  if (arr[i] < arr[index] ) {

					swap(arr, i, index);
					 
			  }

		  }
	  System.out.println(arr[2]);
	  }

	private static void swap(int[] arr, int i, int index) {
		int temp = arr[i];
		arr[i] = arr[index];
		arr[index] = temp;
	}
	 


	private static void swap(int x, int y) {
	int temp=0;
	temp =x;
	x=y;
	y=temp;
		
	}

	private static int findMin(int[] arr) {
		
		int min =arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
		
	}

	private static int findmax(int[] arr) {
		
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] >max)
				
				max =arr [i];
		}
		return max;
		
	}
	
private static int findmaxIndex(int[] arr,int start) {
	
	int maxIndex=start;
	for (int i = start; i < arr.length; i++) {
		
		if (arr[i]> arr[maxIndex])
			
			maxIndex=i;
		
	}
	
	return maxIndex;
		
		
	}


	 

}
