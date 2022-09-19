package com.mouktik;

public class TripleThreadCommunication {
	public static void main(String[] args) {
        PrintingSequences naturalNumbers = new PrintingSequences();

        new Thread("Thread-1") {
            @Override
            public void run() {
                naturalNumbers.printAPStartingFrom1();
            }
        }.start();

        new Thread("Thread-2") {
            @Override
            public void run() {
                naturalNumbers.printAPStartingFrom2();
            }
        }.start();

        new Thread("Thread-3") {
            @Override
            public void run() {
                naturalNumbers.printAPStartingFrom3();
            }
        }.start();
    }
}
