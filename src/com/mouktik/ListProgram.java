package com.mouktik;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	for (int i = 0; i < 5; i++) {
	    list.add(i);
	}
	
	System.out.println(list);
	list.add(2, 6);
	System.out.println(list);
	
	list.set(2, 8);
	System.out.println(list);
	
	System.out.println("convertedString "+convertedString("aaabbbcccaa"));
	System.out.println("convertedString2 "+convertedString2("aaabbbcccaa"));
	System.out.println("convertedString3 "+convertedString3("aabb"));
}

private static String convertedString(String string) {
	StringBuilder  builder = new StringBuilder();
	for (int i = 0; i < string.length(); i++) {
		int count =1;
		
		while(i+1 < string.length() && string.charAt(i) == string.charAt(i+1)) {
			i++;
			count++;
		}
		
		builder.append(string.charAt(i)).append(count);
	}
	
	return builder.toString();
	
}


private static String convertedString2(String string) {
	StringBuilder  builder = new StringBuilder();
	int i = 0;
	//int 
	
	while(i<string.length()) {
		int count = 1;
		while(i+1 < string.length() && string.charAt(i) == string.charAt(i+1)) {
			i++;
			count++;
			
		}
		
		builder.append(string.charAt(i)).append(count);
		i++;
	}
	
	
	return builder.toString();
	
}

//aaabbbccca
private static String convertedString3(String string) {
	StringBuilder  builder = new StringBuilder();
	int count = 0;
	for (int i = 1; i < string.length(); i++) {
		count++;
		
		if(string.charAt(i-1) != string.charAt(i) || i==string.length()-1 ) {
			
			builder.append(string.charAt(i-1)).append(count);
			count = 0;
			
			
		}
		
		/*
		 * if(i==string.length()-1) { builder.append(string.charAt(i)).append(count+1);
		 * }
		 */
		
		
	}
	
	
	
	return builder.toString();
	
}





}


