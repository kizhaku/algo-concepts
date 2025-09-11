package com.kizhaku.learn.scribble;

public class AThread extends Thread{

    public static int amount;

    static {
        //do something
        amount = 10;

    }

    public static void main(String[] args) {
       AThread aThread = new AThread();
       aThread.start();

       while (aThread.isAlive()) {
           System.out.println("Waiting..");
       }
       System.out.println("Amount is: " + amount);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        amount++;
    }
}
