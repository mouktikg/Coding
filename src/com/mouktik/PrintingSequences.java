package com.mouktik;

public class PrintingSequences {
	private static final int LIMIT = 10;
    int counter = 1;
    boolean isPrinting = false;

    // prints 1, 4, 7, 10, ...
    synchronized void printAPStartingFrom1() {
        while (counter <= LIMIT) {
            while (isPrinting || counter % 3 != 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
            }
            isPrinting = true;
            System.out.println(counter++ + " (printed by " + Thread.currentThread().getName() + ")");
            isPrinting = false;
            notifyAll();
        }
    }

    // prints 2, 5, 8, 11, ...
    synchronized void printAPStartingFrom2() {
        while (counter <= LIMIT) {
            while (isPrinting || counter % 3 != 2) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
            }
            isPrinting = true;
            System.out.println(counter++ + " (printed by " + Thread.currentThread().getName() + ")");
            isPrinting = false;
            notifyAll();
        }
    }

    // prints 3, 6, 9, 12, ...
    synchronized void printAPStartingFrom3() {
        while (counter <= LIMIT) {
            while (isPrinting || counter % 5 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                }
            }
            isPrinting = true;
            System.out.println(counter++ + " (printed by " + Thread.currentThread().getName() + ")");
            isPrinting = false;
            notifyAll();
        }
    }
}
