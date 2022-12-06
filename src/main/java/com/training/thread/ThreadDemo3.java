package com.training.thread;

public class ThreadDemo3 implements Runnable{
    String threadName;
    Thread t;

    ThreadDemo3(String threadName){
        this.threadName = threadName;
        t=new Thread(this, this.threadName);
        //System.out.println("Created Thread: "+t);
        t.start();
    }

    @Override
    public void run() {
        try {
            if(t.getName().equalsIgnoreCase("FIRST")){
                for (int i = 1; i < 11; i++) {
                    System.out.println(i+"*5="+(i*5));
                    Thread.sleep(2000);   // Go to Sleep state : waiting

                }

            }
            else if(t.getName().equalsIgnoreCase("SECOND")){
                for (int i = 1; i < 11; i++) {
                    System.out.println(i+"*8="+(i*8));
                    Thread.sleep(2000);   // Go to Sleep state : waiting

                }
            }


        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(t.getName()+" Thread Exiting....");  // Thread is terminated

    }
}

//Create 3 threads named "ADD", "SUBTRACT", MULTIPLY
//When ADD thread runs it will add two given numbers
// When SUBTRACT thread runs it will subtract two given numbers
//and so on..
