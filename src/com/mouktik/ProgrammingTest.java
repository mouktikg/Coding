package com.mouktik;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProgrammingTest {
	
	public static void main(String[] args) {
		//System.out.println(fibinacciSeries1(8));
	
		
		//fibonacciSeries(15);
		//palindromeString("LEVEL");
		
		//palinDromeNumber(454);
		
		//armstrongNumber(370);
		//charOccuranceInWord("Mouktik",'k');
		
		
		  String word = "Mouktik"; char search = 'k';
		  
		  long count = word.chars().filter(x->x==search).count();
		  System.out.println(count);
		  
		  long count2 = word.chars().filter(n->n==search).count();
		  
		  word.chars().forEach(n-> System.out.println(n));
		  
		  
		  Map<Integer, Long> collect = word.chars().boxed().collect(Collectors.groupingBy(n->n,Collectors.counting()));
		  IntStream chars = word.chars();
		  
		  Stream<Integer> boxed = word.chars().boxed();
		
		  collect.entrySet().forEach(n-> System.out.println(new Character((char) (int)n.getKey()) + " "+n.getValue()));
		 
		
		  List<String> list = new ArrayList<>();
		  
		  
		  
		  
		//bubbleSort(new int[] {10,3,8,4,9});
		//selectionSort(new int[] {10,3,8,4,9});
		
		
		/*
		 * Pattern p=Pattern.compile("\\s"); String[]
		 * str=p.split("Pattern Split Method in Java regex"); for(String str1:str) { //
		 * // System.out.println(" "+str1); }
		 * 
		 * 
		 * Stream.of(str).map(n->n.toUpperCase()).sorted((i1,i2)->
		 * i2.compareTo(i1)).forEach(n-> System.out.println(n));
		 */
		 //  Arrays.sort(str);
      //  System.out.println(Arrays.toString(str));
		
		//String str= "This#..;,string%contains^special*characters&.";   
		//str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		
		//String[] split = str.split("[^a-zA-Z0-9]");
	//	System.out.println(split.length);
		
		
		//Stream.of(split).forEach(n-> System.out.println(n));
		//System.out.println(str);  
		
		
		/*
		 * String sentence = ". let me; check"; String[]
		 * split2 = sentence.split("[^a-zA-Z0-9]");
		 * 
		 * System.out.println(split2.length); //Stream.of(split2).forEach(n->
		 * System.out.println(n)); Stream.of(split2).filter(n->n
		 * !="").map(n->n.toUpperCase()).sorted(Comparator.comparing(n->n)) .forEach(n->
		 * System.out.println(n));
		 */
		//sentence.replaceAll
		
		// System.out.println("anagram "+anagram("Mother In Law","Hitler Woman")); 
		 System.out.println("anagramUsingMap "+anagramUsingMap("Mother In Law","Hitler Woman")); 
		 
	}
	public static int fibinacciNumber(int num) {
		
		if(num==1 || num ==2) {
		return 1;
		}
		
		return fibinacciNumber(num -1)+ fibinacciNumber(num-2); 
		
		
	}
	
	private static void fibonacciSeries(int num) {
		
		Stream.iterate(new int[] {0,1}, t->new int[] {t[1], t[0]+t[1]}).limit(num)
		.map(t -> t[0]).forEach(n->System.out.println(n));
		
		//Stream.iterate(new int[] {0,1},t-> new int[] {t[1], t[0]+t[1]}).limit(num).map(t->t[0]).forEach(n->syso);
	}
	
	private static void palindromeString(String word) {
		String reverse = "";
		for (int i = word.length()-1; i >=0 ; i--) {
			reverse = reverse +word.charAt(i);
		}
		
		if(word.equals(reverse)) {
			System.out.println(word + " is a Palindrome String");
		}else {
			System.out.println(word + " is not a Palindrome String");
		}
	}
	
	private static void palinDromeNumber(int num) {
		int r,sum = 0,temp;
		temp = num;
		while(num > 0) {
		r= num%10;	
			sum = sum*10 +r;
			num = num/10;
		}
		
		if(temp == sum) {
			System.out.println(temp + " is a Palindrome Number");
		}else {
			System.out.println(temp + " is not a Palindrome Number");
		}
		}
	
	private static void armstrongNumber(int num) {
		
		int r, sum=0, temp;
		
		temp = num;
		while(num>0) {
			
			r = num %10;
			sum = sum + r*r*r;
			num = num/10;
			
		}
		
		if(temp == sum) {
			
			System.out.println("An Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}
		
		
	}
	
	private static void charOccuranceInWord(String word, char search) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			
			if(word.charAt(i) == search) {
				count++;
			}
			
		}
		System.out.println("Occurance of "+search+" is "+count);
	}
		
	private static void bubbleSort(int[] array ) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			int flag = 0;
			for (int j = 0; j < array.length-i-1; j++) {
				
				if(array[j]>array[j+1]) {
					
					temp = array[j];
					array[j] =array[j+1];
					array[j+1] = temp;
					flag = 1;
				}
				
				if(flag ==0) {
					break;
				}
			}
			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	
	private static void selectionSort(int[] arr) {
		int min,temp;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i+1; j < arr.length; j++) {
				
			if(arr[j]<arr[min]) {
				
				min = j;
			}	
				
			}
			
			temp = arr[i];
			arr[i] = arr[min];
			arr[min]= temp;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	private static boolean anagram(String s1, String s2) {
		 s1 = s1.replaceAll("\\s", "").toUpperCase();
		 s2 = s2.replaceAll("\\s", "").toUpperCase();
		 
		 if(s1.length() != s2.length()) {
			 return false;
		 }
		 char[] charS1 = s1.toCharArray();
		 char[] charS2 = s2.toCharArray();
		 Arrays.sort(charS1);
		 Arrays.sort(charS2);
		 
		 if(Arrays.equals(charS1, charS2)) {
			 return true;
		 }
		 
		
		return false;
		
	}
	
	
	private static boolean anagramUsingMap(String s1, String s2) {
		
		s1 = s1.replaceAll("\\s", "").toUpperCase();
		s2 = s2.replaceAll("\\s", "").toUpperCase();
		
		Map<Character,Integer> map = new HashMap<>();
		
		if(s1.length() != s2.length()) {
			 return false;
		 }
		
		
		for (int i = 0; i < s1.length(); i++) {
			char charS1 = s1.charAt(i);
			if(map.containsKey(charS1)) {
				map.put(charS1, map.get(charS1)+1);
			}else {
				map.put(charS1,1);
			}
			
		}
		
		for (int i = 0; i < s2.length(); i++) {
			
			char charS2 = s2.charAt(i);
			
			if(map.containsKey(charS2)) {
				
				
				if(map.get(charS2)>1) {
				map.put(charS2, map.get(charS2)-1);
				}else {
					map.remove(charS2);
				}
			}
			
		}
		if(map.size() == 0) {
			return true;
		}
		
		
		return false;
		
	}
}
