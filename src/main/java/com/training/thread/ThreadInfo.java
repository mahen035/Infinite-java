package com.training.thread;

public class ThreadInfo {

    public static void main(String... args){
        Thread t = Thread.currentThread();
        System.out.println("Current thread is "+t);
        t.setName("demo thread");
        System.out.println("New Name of the thread is: "+t);
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread is exiting...");
    }
}

// There are two ways to create thread
//1. By Implementing Runnable interface
//2. By extending Thread class
