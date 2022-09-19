package com.mouktik;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BitProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(reverse(10));
		// System.out.println(reverse(10));
		/*
		 * boolean[] sieveOfEratosthenes = sieveOfEratosthenes(20); for (int i = 0; i <
		 * sieveOfEratosthenes.length; i++) { System.out.println(i+" " +
		 * sieveOfEratosthenes[i]); }
		 */

		// System.out.println(gcd(18,36));

		// System.out.println(fastPower(2,5));

		/*
		 * int[] subArr = new int[] { 10, 15, -5, 15, -10, 6, 7 }; int sum = 20; int[]
		 * subArray = subArray(subArr, sum); for (int i : subArray) {
		 * System.out.println(i); }
		 */
		
		int a[] = new int[] {1,2,2,1,3,1,1,3};
				
				 countDistinctElements(a, 4) ;
	}

	// no of trailing zeros
	int solve(int A) {
		int count = 0;
		while ((A & 1) == 0 && A > 0) {
			count++;
			A >>= 1;
		}

		return count;
	}

	// Write a function that takes an integer and returns the number of 1 bits it
	// has.
	int numSetBits(int A) {

		int count = 0;
		while (A != 0) {

		A = A & (A - 1);
			count++;
		}

		return count;
	}

	// Reverse the bits of an 32 bit unsigned integer A.
	static int reverse(int A) {

		int B = 0;

		for (int i = 0; i < 32; i++) {
			int k = A & 1;
			B <<= 1;
			B = B | k;

			A >>= 1;

		}

		return B;
	}

	public long reverse(long A) {
		long rev = 0;

		for (int i = 0; i < 32; i++) {
			rev <<= 1;
			if ((A & (1 << i)) != 0)
				rev |= 1;
		}

		return rev;

	}

	// Sieve of Eratosthenes

	// 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
	// f,f,t,t,t,t,t,t,t,t,t, t, t, t, t, t, t, t, t, t, t

	static boolean[] sieveOfEratosthenes(int n) {

		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (int i = 2; i * i <= n; i++) {

			for (int j = 2 * i; j <= n; j += i) {
				isPrime[j] = false;
			}

		}

		return isPrime;

	}

//GCD- Greatest Common Divisor

	static int gcd(int a, int b) {
		return a % b == 0 ? b : gcd(b, a % b);

	}

	static int fastPower(int a, int b) {
		int res = 1;

		while (b > 0) {

			if ((b & 1) != 0) {
				res = res * a;
			}

			a = a * a;
			b = b >> 1;
		}

		return res;

	}

	static int intersection(int a[], int b[]) {

		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> unionHashSet = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			hashSet.add(a[i]);
		}

		for (int i = 0; i < b.length; i++) {

			if (hashSet.contains(b[i])) {
				unionHashSet.add(b[i]);
			}

		}
		return unionHashSet.size();

	}

	static int[] subArray(int[] a, int sum) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		//int[] subArr = new int[] { 10, 15, -5, 15, -10, 6, 7 };
		
		int res = 0;
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < a.length; i++) {
			res = res + a[i];
			map.put(res, i);
			
			if(res==sum) {
				startIndex = 0;
				endIndex = i;
				break;
			}
			
		if(map.containsKey(res-sum)) {
			 startIndex= map.get(res-sum)+1;
			 endIndex = i;
			 break;
			
		}	
		}
		int[] subArr = new int [endIndex -startIndex+1];
		int k = 0;
		for (int j = startIndex; j <= endIndex; j++) {
			subArr[k] = a[j];
			k++;
		}
		
		
		return subArr;

	}
	
	// Find Largest subArray with equal no of 1 and o
	
	// [1,1,0,1,1,0,0] -> convert 0 to -1
	
	
	//count the distinct elements in every window of size k
	//[1,2,2,1,3,1,1,3]
	
	static void countDistinctElements(int a[], int k) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < k; i++) {
			
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
			
		}
		
		System.out.println(map.size());
		
		for (int i = k; i < a.length; i++) {
			
			if(map.get(a[i-k])==1) {
				
				map.remove(i-k);
			}else {
				
				map.put(a[i-k], map.get(a[i-k])-1);
			}
			
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
			
			System.out.println(map.size());
		}
		
		
	}
		
}
