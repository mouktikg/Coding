package com.mouktik;

public class ThreeThreadsCodeWithWait {
	  
    // Starting counter
    int counter = 1;
  
    static int N;
  
    public void printOddNumber()
    {
    	synchronized (this)
    	{
    		Thread.currentThread().setName("Thread 1");
    		// Print number till the N
    		while (counter < N ) {
    			if(counter%5 != 0) {
    				// If count is even then print
    				if (counter % 2 == 0) {

    					try {
    						wait();
    					}
    					catch (
    							InterruptedException e) {
    						e.printStackTrace();
    					}
    				}
    				
    				System.out.println(Thread.currentThread().getName() + " " +counter + " ");
    			}
    			// Increment counter
    			counter++;

    			notifyAll();
    		}
    	}
    }
  
    public void printEvenNumber()
    {
    	synchronized (this)
    	{
    		Thread.currentThread().setName("Thread 2");
    		while (counter < N ) {
    			
    			if(counter%5 != 0) {
    				if (counter % 2 == 1 ) {

    					try {
    						wait();
    					}
    					catch (
    							InterruptedException e) {
    						e.printStackTrace();
    					}
    				}
    				
    				System.out.println(Thread.currentThread().getName() + " " + counter + " ");
    						
    			}
    			counter++;

    			notifyAll();
    		}
    	}
    }
  
    
    public void printFactorsOfFive()
    {
    	Thread.currentThread().setName("Thread 3");
    	synchronized (this)
    	{
    		while (counter < N ) {
    			
    				if (counter % 5 != 0 ) {

    					try {
    						wait();
    					}
    					catch (
    							InterruptedException e) {
    						e.printStackTrace();
    					}
    				}
    				
    				System.out.println(Thread.currentThread().getName() + " " + counter + " ");
    						
    			counter++;

    			notifyAll();
    		}
    	}
    }
    // Driver Code
    public static void main(String[] args)
    {
        N = 16;
  
        ThreeThreadsCodeWithWait mt = new ThreeThreadsCodeWithWait();
  
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });
  
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNumber();
            }
        });
        
        Thread t3 = new Thread(new Runnable() {
            public void run()
            {
                mt.printFactorsOfFive();
            }
        });
  
  
       
        t1.start();
        t2.start();
        t3.start();
    }
}