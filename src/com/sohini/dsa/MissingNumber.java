package com.sohini.dsa;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(5);
		numList.add(2);
		numList.add(3);
		numList.add(6);
		numList.add(7);
		numList.add(8);
		numList.add(9);
		numList.add(10);
		System.out.println(findMissingNumber(numList));

	}

	private static int findMissingNumber(List<Integer> numList) {
		int sum=0;
		
		for (int i = 0; i < numList.size(); i++) {
			
			sum= sum + numList.get(i);
			
			
		}
		
		int sumOfFirstNthNumber= 10 *(10+1) /2;
		
		int missingNumber =sumOfFirstNthNumber-sum;
		return missingNumber;	
	}


}
