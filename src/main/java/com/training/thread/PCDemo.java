package com.training.thread;

public class PCDemo {
    public static void main(String... args){
        MyQueue q = new MyQueue();
        new Producer(q);
        new Consumer(q);

        System.out.println("Press ctrl+c to stop");
    }
}
