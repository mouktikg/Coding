package com.mouktik;

public class GCD {
public static void main(String[] args) {
	System.out.println(findGCD(5,10));
}

private static int findGCD(int i, int j) {
	// TODO Auto-generated method stub
	
	if(j==0) {
		return i;
	}
	return findGCD(j,i%j);
	
	
}
}
