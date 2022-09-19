package com.mouktik;


public class MyStack {
	
	
	int a[];
	int top;
	int capacity;
	
	MyStack(int capacity){
		top = -1;
		
		a = new int[capacity];
		this.capacity = capacity;
	}

	
	void push(int data) throws Exception {
		
		if(top ==capacity-1) {
			throw new Exception("Stack is Full");
		}
		
		top++;
		a[top] = data;
	}
	
	int pop() throws Exception {
		if(top == -1) {
			throw new Exception("Stack is Empty");
		}
		int res = a[top];
		top--;
		return res;
		
		
	}
	
	int peek() throws Exception {
		if(top == -1) {
			throw new Exception("Stack is Empty");
		}
		
		return a[top];
		
		
	}
	
	boolean isEmpty() {
		return top==-1;
	}
}
