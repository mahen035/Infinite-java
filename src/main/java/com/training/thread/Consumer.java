package com.training.thread;

public class Consumer implements Runnable{

    MyQueue q;
    Consumer(MyQueue q){
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {

        while(true){
            q.get();
        }

    }
}
