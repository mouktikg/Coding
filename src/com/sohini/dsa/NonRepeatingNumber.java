package com.sohini.dsa;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatingNumber {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(10);
		numList.add(100);
		numList.add(15);
		numList.add(100);
		
		
		
		System.out.println(findNonRepeatingNumber(numList));
		

}

	private static int findNonRepeatingNumber(List<Integer> numList) {
		
		int num = 0;
		for (Integer value : numList) {
			
			num = num ^ value;
			
		}
		return num;
		
	}
}