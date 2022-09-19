package com.mouktik;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest implements Runnable {

	// private static AtomicInteger count=new AtomicInteger(0);
	private static int count;

	private boolean flag = false;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		useFlag();
	}

	public void updateFlag() {

		flag = true;
	}

	public void useFlag() {

		while (!flag) {

			System.out.println("Flag is false");
		}

		if (flag) {
			System.out.println("Flag is true");
		}
	}

	public void myCount() throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			// count.incrementAndGet();
			count++;
			// System.out.println(Thread.currentThread().getName()+" "+count);

			Thread.sleep(1000);
		}

	}

	public static void main(String[] args) throws InterruptedException {
		/*
		 * ThreadTest t1 = new ThreadTest(); System.out.println("I am Main"); Thread th1
		 * = new Thread(t1,"First"); //Thread th2 = new Thread(t1,"Second");
		 * 
		 * 
		 * ThreadTest t2 = new ThreadTest(); Thread th2 = new Thread(t2);
		 * 
		 * //th1.setDaemon(true); //th2.setDaemon(true);
		 * 
		 * th1.start(); Thread.sleep(1); t1.updateFlag();
		 */
		// th2.start();
		// th1.join();
		// th2.join();
		// System.out.println("main count "+ThreadTest.count);

		// System.out.println("I am Main");
		extracted(10);
		

	}

	private static void extracted(int n) {
		if(n%5 == 0) {
			System.out.println("divisible by 5");
		}
	}

}
