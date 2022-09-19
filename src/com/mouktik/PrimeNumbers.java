package com.mouktik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {
	
	
	public static void main(String[] args) {
		primeNumberList(100);
		
		boolean[] sieveOfEratosthene = sieveOfEratosthene(100);
		for (int i = 0; i < sieveOfEratosthene.length; i++) {
			System.out.println(i + " "+sieveOfEratosthene[i]);
		}
	}

	private static boolean[] sieveOfEratosthene(int num) {
		// TODO Auto-generated method stub
		boolean isPrime[] = new boolean[num+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1]= false;
		
		for (int i = 2; i*i <= num; i++) {
			
			for (int j = i*2; j <= num; j+=i) {
				isPrime[j]= false;
			}
			
		}
		
		return isPrime;
	}

	private static void primeNumberList(int num) {

		List<Integer> primeList = new ArrayList<>();
		for (int i = 2; i <= num; i++) {
			boolean flag = true;
			
			for (int j = 2; j*j <= i; j++) {
				if(i%j == 0) {
					
					flag = false;
					break;
				}
				
			}
			
			if(flag) {
				primeList.add(i);
				
			}
			
			
		}
		System.out.println(primeList);
		System.out.println(primeList.size());
	}

}
