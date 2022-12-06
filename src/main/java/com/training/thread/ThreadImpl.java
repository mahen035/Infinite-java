package com.training.thread;

public class ThreadImpl {
    public static void main(String... args){
        //new ThreadDemo2();
        new ThreadDemo3("ONE");
        new ThreadDemo3("TWO");
        new ThreadDemo3("THREE");
        try{

                Thread.sleep(1000);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Main Thread Exiting....");
    }
}

