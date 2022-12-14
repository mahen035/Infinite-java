package com.training.thread;

public class ThreadDemo1 implements Runnable{

    Thread t;
    ThreadDemo1(){
        t = new Thread(this, "Demo1"); // New Thread is born
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Child thread: "+t);
        t.start();  // Thread is in Runnable state
    }
    @Override
    public void run() {  // Thread is in Running state
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(2000);   // Go to Sleep state : waiting
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Child Thread Exiting....");  // Thread is terminated

    }
}

// Whole thread concept
// Inter Thread communication
