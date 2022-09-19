package com.sohini.dsa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlphabeticallySorting {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Sohini");
		nameList.add("Piju");
		nameList.add("Poulami");
		
		alphabeticallySorting(nameList);

	}

	private static void alphabeticallySorting(List<String> nameList) {
		
		for (int i = 0; i < nameList.size()-1; i++) {
			
			for (int j=0; j<nameList.size()-i-1; j++ )
			{
				if(nameList.get(j).compareTo(nameList.get(j+1)) >0)
				{
					swap(nameList, j);
					
				}
			}
			
			
		}
		System.out.println(nameList);
		
		
	
		
		
	}

	private static void swap(List<String> nameList, int j) {
		String temp= nameList.get(j);
		nameList.set(j, nameList.get(j+1));
		nameList.set(j+1, temp);
	}

}
