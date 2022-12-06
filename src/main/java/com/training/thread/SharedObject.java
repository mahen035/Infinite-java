package com.training.thread;

public class SharedObject {

     synchronized void sharedMethod(String str){ // When one thread enters this method, no other thread is
                                                 // allowed to enter
        System.out.print("[");
        System.out.print(str);
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print("]");
        System.out.println();
    }
}



//[Sprit]
//[Of]
//[ABC]