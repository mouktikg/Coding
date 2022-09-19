package com.mouktik;


import java.util.Stack;

public class StackProgram {
	public static void main(String[] args) {

		int a[] = new int[] { 4, 10, 5, 18, 3, 12, 7 };
		// previousSmallerElement(a);
		// previousGreaterElement(a);
		int b[] = new int[] { 3, 10, 5, 1, 15, 10, 7, 6 };
		nextSmallerElement(b);
	}

	// previous smaller element
	// [4,10,5,18,3,12,7]
	// [-1,4,4,,5,-1,3,3]

	static void previousSmallerElement(int a[]) {

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < a.length; i++) {

			while (!stack.isEmpty() && stack.peek() >= a[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				System.out.println(-1);
			} else {
				System.out.println(stack.peek());
			}

			stack.push(a[i]);

		}
	}

	// previous greater element
	// [4,10,5,18,3,12,7]
	// [-1,-1,10,-1,18,18,12]

	static void previousGreaterElement(int a[]) {

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < a.length; i++) {

			while (!stack.isEmpty() && stack.peek() <= a[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				System.out.println(-1);
			} else {
				System.out.println(stack.peek());
			}

			stack.push(a[i]);

		}
	}

	// next smaller element
	// [3,10,5,1,15,10,7,6]
	// [1,5,1,-1,10,7,6,-1]

	static void nextSmallerElement(int a[]) {

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = a.length - 1; i >= 0; i--) {

			while (!stack.isEmpty() && stack.peek() >= a[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				System.out.println(-1);
			} else {
				System.out.println(stack.peek());
			}

			stack.push(a[i]);

		}
	}

	static boolean isParenthesisMatching(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(isOpening(ch)) {
				stack.push(ch);
				
			}else {
				if(stack.isEmpty()) {
					
					return false;
				}else if(!isMatching(stack.peek(),ch)) {
					return false;
					
				}else {
					stack.pop();
				}
					
				}
				
				
			}
			
			
			
		
		return stack.isEmpty();

	}

	private static boolean isOpening(char c) {
		return c == '(' || c == '{' || c == '[';

	}

	private static boolean isMatching(char a, char b) {
		return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');

	}
}
