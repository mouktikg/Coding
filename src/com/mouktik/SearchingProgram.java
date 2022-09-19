package com.mouktik;

public class SearchingProgram {
	
	public static void main(String[] args) {
		
		int serach = linearSerach(new int[] {4,8,2,5,7}, 5);
		System.out.println(serach);
		
		int binarySearch = binarySearch(new int[] {1,2,3,4,5,6}, 4);
		System.out.println("binarySearch "+binarySearch);
		
		int binarySearchDesc = binarySearch(new int[] {6,5,4,3,2,1}, 6);
		System.out.println("binarySearchDesc "+binarySearchDesc);
		
		int binarySearchRecurssion = binarySearchRecurssion(new int[] {1,2,3,4,5,6}, 0, 5, 2);
		System.out.println("binarySearchRecurssion "+binarySearchRecurssion);
		
		int binarySearchRecurssionDesc = binarySearchRecurssion(new int[] {6,5,4,3,2,1}, 0, 5, 1);
		System.out.println("binarySearchRecurssionDesc "+binarySearchRecurssionDesc);
	}

	
	private  static int linearSerach(int[] a, int target) {
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == target)
				return i;
				
		}
		return -1;
		
	}
	
	private static int binarySearch(int[] a, int target) {
		
		int start = 0;
		int end = a.length-1;
		int mid = 0;
		
			
			boolean isAccending = a[start] < a[end];
		
		while(start <= end) {
			mid = start + (end-start)/2;
			
			if(a[mid]== target) {
				return mid;
			}
			
			if(isAccending) {
			 if(a[mid]>target) {
				end = mid -1;
				
			}else {
				
				start = mid +1;
			}
			}else {
				 if(a[mid]>target) {
						
						start = mid +1;
						
					}else {
						end = mid -1;
						
					}
				
			}
		
		}
		
		return -1;
		
	}
	
	private static int binarySearchRecurssion(int[] a, int start, int end, int target) {

		boolean isAccending = a[start] < a[end];
		if (start >= 0 && end <= a.length - 1) {
			int mid = start + (end - start) / 2;
			if (a[mid] == target) {
				return mid;
			}

			if (isAccending) {
				if (a[mid] > target) {

					return binarySearchRecurssion(a, start, mid - 1, target);
				} else {
					return binarySearchRecurssion(a, mid + 1, end, target);
				}
			} else {
				if (a[mid] > target) {
					return binarySearchRecurssion(a, mid + 1, end, target);

				} else {

					return binarySearchRecurssion(a, start, mid - 1, target);
				}

			}

		}

		return -1;

	}
	
}
