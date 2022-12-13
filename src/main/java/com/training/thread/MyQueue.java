package com.training.thread;

public class MyQueue {

    int n;
    boolean value = false;
    synchronized int get(){
        if(!value){
            try {
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Got the value: "+n);
        value = false;
        notify();
        return n;
    }

    synchronized void put(int n){
        if(value){
            try {
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        this.n = n;
        value = true;
        System.out.println("Putting the value: "+n);
        notify();
    }
}

// Thread: What is a thread and how to get thread information
// Creating Thread: using Runnable interface and Thread class
// Creating and Running Multiple threads
// Synchronizing multiple threads
// Thread Communication
