package com.mouktik;

public class MainClass{
public static void main(String[] args) {
	MyThread t1 = new MyThread(1);
	MyThread t2 = new MyThread(2);
	MyThread t3 = new MyThread(5);
	
	t1.start();
	t2.start();
	t3.start();
}
}


