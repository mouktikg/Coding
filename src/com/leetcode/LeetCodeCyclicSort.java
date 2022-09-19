package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeCyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = new int[] { 4, 10, 5, 18, 3, 12, 7 };
		
		int a[] = new int[] { 3,2,3};
		int[] twoSum = twoSum(a,6);
		
		System.out.println(Arrays.toString(twoSum));
		
		int a2[] = new int[] {0,1,2};
		System.out.println("268 : Missing Number "+missingNumber(a2));
		System.out.println("448 : Find all numbers disappeared in an array "+findDisappearedNumbers(new int[] {1,1}));
		System.out.println("287 : Find the duplicate number "+findDuplicate(new int[] {1,1,2}));
		
		System.out.println("442 : Find all duplicates in an array "+findDuplicates(new int[] {4,3,2,7,8,2,3,1}));

		System.out.println("645 : set mismatch "+ Arrays.toString(findErrorNums(new int[] {1,1}))); 

	}

	
	 public static int[] twoSum(int[] nums, int target) {
	        
	        for(int i = 0; i<nums.length;i++){
	            
	           for(int j = i+1; i<nums.length;j++){
	            
	            if((nums[i]+nums[j]) == target){
	                
	               
	               return new int[]{i,j} ;
	            }
	               
	               
	            } 
	        }
	        
	    return new int[]{};
	    }
	 
	 
	 //268 : Missing Number
	 private  static int missingNumber(int[] a) {
			
			int i = 0;
			while(i<a.length) {
				if(a[i] != i) {
					int correct = a[i];
					swap(a, i, correct);
					
				}else {
					i++;
				}
				                
			}
			
			for (int j = 0; j < a.length; j++) {
				
				if(a[j] != j) {
					
					return j;
				}
				
			}
			return a.length;
			
		}

		private static void swap(int[] a, int i, int correct) {
			int temp = a[i];
			a[i] = a[correct];
			a[correct] = temp;
		}
		
		
		//448 : Find all numbers disappeared in an array
		 private  static List<Integer> findDisappearedNumbers(int[] a) {
			 List<Integer> list = new ArrayList<>();
			 
			 int i = 0;
			 
				while(i<a.length) {
					int correct = a[i] -1;
					if(a[i] != i+1 && a[i] != a[correct]) {
						
						swap(a, i, correct);
						
					}else {
						i++;
					}
					                
				}
				
				
				for (int j = 0; j < a.length; j++) {
					
					if(a[j] != j+1) {
						
						list.add(j+1);
					}
					
				}
			 
			return list;
			 
		 }
		 
		//287 : Find the duplicate number
		 private  static int findDuplicate(int[] a) {
			 
			 int i = 0;
			 
				while(i<a.length) {
					
					if(a[i] != i+1 )  {
						int correct = a[i] -1;
						if(a[i] != a[correct]) {
						swap(a, i, correct);
						}else {
							return a[i];
						}
						
					}else {
						i++;
					}
				}
			 
			return a.length;
			 
		 }
		 
		 
		//442 : Find all duplicates in an array
		 private  static List<Integer> findDuplicates(int[] a) {
			 List<Integer> list = new ArrayList<>();
			 
			 int i = 0;
			 
				while(i<a.length) {
					int correct = a[i] -1;
					if(a[i] != i+1 && a[i] != a[correct]) {
						
						swap(a, i, correct);
						
					}else {
						i++;
					}
					                
				}
				
				
				for (int j = 0; j < a.length; j++) {
					
					if(a[j] != j+1) {
						
						list.add(a[j]);
					}
					
				}
			 
			return list;
			 
		 }
		 
		//645 : set mismatch
		 private  static int[] findErrorNums(int[] a) {
			 
			 int i = 0;
			 
				while(i<a.length) {
					
					if(a[i] != i+1 )  {
						int correct = a[i] -1;
						if(a[i] != a[correct]) {
						swap(a, i, correct);
						}else {
							return new int[] {a[i],i+1};
						}
						
					}else {
						i++;
					}
				}
			 
			return new int[] {};
			 
		 }
}
