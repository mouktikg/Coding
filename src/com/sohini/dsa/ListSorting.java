package com.sohini.dsa;

import java.util.ArrayList;
import java.util.List;




public class ListSorting {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(5);
		numList.add(100);
		numList.add(15);
		numList.add(170);
		numList.add(45);
		
		bubbleSort(numList);
		
		

	}

	private static void bubbleSort(List<Integer> numList) {
		for(int i=0; i<numList.size()-1; i++)
		{
			for (int j=0; j<numList.size()-i-1; j++)
			{
				if (numList.get(j) > numList.get(j +1))
				{
					swap(numList, j);
				
					
					
				}
						
			}
		}
		
		System.out.println(numList);
	}

	private static void swap(List<Integer> numList, int j) {
		int temp =numList.get(j);
		numList.set(j,numList.get(j+1)) ;
		numList.set(j+1, temp);
	}

}
