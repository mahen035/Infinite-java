package com.training.thread;

public class ThreadDemo2 extends Thread{

    ThreadDemo2(){
        super("Demo Thread 2");
        System.out.println("Child Thread "+this);
        start();
    }

    public void run() {  // Thread is in Running state
        try {
            for (int i = 1; i < 3; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(1000);   // Go to Sleep state : waiting
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Child Thread Exiting....");  // Thread is terminated

    }
}
