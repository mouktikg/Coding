package com.sohini.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(45);
		numList.add(100);
		numList.add(15);
		numList.add(170);
		numList.add(45);
		numList.add(15);
		numList.add(15);
		
		
		Set<Integer> findDuplicate = findDuplicate(numList);
		
		System.out.println(findDuplicate);
	}

	private static Set<Integer> findDuplicate(List<Integer> numList) {
		
		Set<Integer> numSet = new HashSet<Integer>();
		Set<Integer> duplicateSet =new HashSet<>();
		
		for (Integer value : numList) {
			
			if(numSet.add(value)== false)
			{
				duplicateSet.add(value);
			}
		}
		return duplicateSet;
		
		
		
		
	}
}
