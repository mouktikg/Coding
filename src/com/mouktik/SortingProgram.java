package com.mouktik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingProgram {
	
	public static void main(String[] args) {
		//List<Integer> list = List.of(5,4,3,2,1);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
		    list.add(i);
		}

		// Move the elements to a random order
		Collections.shuffle(list);
		System.out.println("Before Sorting "+list);
		
		bubbleSort(list);
		
		
		List<String> list2 = Arrays.asList("bat","cat","ant","abc");
		System.out.println("Before Sorting "+list2);
		stringBubbleSort(list2);
		
		
		selectionSort(list2.toArray(new String[list2.size()]));
		
		insertionSort(new int[] {4,6,1,5,2});
		
		// int[] a = new int[] {1,2,3,4,5,6,12,7,8,18,13,11,9};
		int[] a = new int[] {3,15,9,7,13,12,16,4,18,11,6};
		quickSort(a,0,a.length-1);
		
		System.out.println("quickSort "+Arrays.toString(a));
		
		mergeSort(a, 0, a.length-1);
		
		System.out.println("mergeSort "+Arrays.toString(a));
		
		int[] a1 = new int[] {3,5,2,1,4};
		cyclicSort(a1);
		System.out.println("cyclicSort "+Arrays.toString(a1));
	}

	
	private static void bubbleSort(List<Integer> list) {
		int temp= 0;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {

				if (list.get(j) > list.get(j + 1)) {
					temp = list.get(j);

					list.set(j, list.get(j + 1));

					list.set(j + 1, temp);

				}

			}
		}
		
		System.out.println(list);
		// TODO Auto-generated method stub

	}
	
	private static void stringBubbleSort(List<String> list) {
		String temp= null;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {

				if (list.get(j).compareTo(list.get(j + 1)) >0 ) {
					temp = list.get(j);

					list.set(j, list.get(j + 1));

					list.set(j + 1, temp);

				}

			}
		}
		
		System.out.println(list);
		// TODO Auto-generated method stub

	}
	
	
	
	private static void selectionSort(String[] arr) {
		String temp = null;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {

			min = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}

			}

			if (min != i) {
				temp = arr[min];
				arr[min] = arr[i];

				arr[i] = temp;

			}

		}

		System.out.println("selectionSort " + Arrays.toString(arr));

	}
	
	private static void insertionSort(int[] a) {
		int temp = 0;
		int j =0;
		for (int i = 1; i < a.length; i++) {
			
			 j = i;
			 temp = a[i];
			
			while(j>0 && a[j-1] > temp) {
				
				a[j]= a[j-1];
				j--;
			}
			
			a[j]= temp;
			
		}
		System.out.println("insertionSort "+Arrays.toString(a));
		
	}
	
	private static void quickSort(int[] a, int low, int high) {
		
		if(low >= high) {
			return;
		}
		
		int s = low;
		int e = high;
		int mid = s +(e-s)/2;
		int pivot = a[mid];
		
		while(s <= e) {
			
			while(a[s] < pivot) {
				s++;
			}
			
			while(a[e]> pivot) {
				e--;
			}
			
			if(s <= e) {
				
				swap(a, s, e);
				s++;
				e--;
			}
		}
		
		quickSort(a, low, e);
		quickSort(a, s,high);
		
	}
	
	private static void mergeSort(int[] a, int start, int end) {
		
		if(end - start ==0) {
			return;
		}
		
		int mid = start + (end - start)/2;
		
		mergeSort(a,start,mid);
		mergeSort(a,mid+1,end);
		
		merge(a,start,mid,end);
	}


	private static void merge(int[] a, int start, int mid, int end) {
		int[] mix = new int[end-start];	

		int i = start;
		int j= mid;
		int k = 0;

		while(i<mid && j<end) {
			
			if(a[i]<a[j]) {
				mix[k]= a[i];
				i++;

			}else {
				mix[k]= a[j];
				j++;
			}
			k++;
		}

		while(i<mid) {
			
			mix[k]= a[i];
			i++;
			k++;

		}
		while(j<end) {
			
			mix[k]= a[j];
			j++;
			k++;

		}

		for (int l = 0; l < mix.length; l++) {

			a[start+l] =mix[l];

		}
	}
	
	private  static void cyclicSort(int[] a) {
		
		int i = 0;
		while(i<a.length) {
			if(a[i] != i+1) {
				int correct = a[i] -1;
				swap(a, i, correct);
				
			}else {
				i++;
			}
			                
		}
		
	}


	private static void swap(int[] a, int i, int correct) {
		int temp = a[i];
		a[i] = a[correct];
		a[correct] = temp;
	}
	
}


