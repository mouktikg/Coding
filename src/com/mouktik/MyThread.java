package com.mouktik;

public class MyThread extends Thread{
	
	public static int counter = 1;
	int i;
	MyThread(int i)
    {
        this.i=i;
    }
	
	public void run() {
		synchronized (this)
		{
			while(counter <=20){
				
				if(this.i != i) {
					try {
						wait();
						System.out.println(i +" am waiting");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				if(i ==5 && counter% 5 ==0) {
					System.out.println("Thread 3 "+counter);
					counter++;
				}else if(i==2 && counter%2 ==0 && counter % 5 != 0) {
					System.out.println("Thread 2 "+counter);
					counter++;
				}else if(i==1 && counter%5 != 0 && counter%2 != 0) {
					System.out.println("Thread 1 "+counter);
					counter++;
				}
				
				notifyAll();

			} 
		}
		
		
		
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread(1);
		MyThread t2 = new MyThread(2);
		MyThread t3 = new MyThread(5);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
