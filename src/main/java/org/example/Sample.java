package org.example;

public class Sample {

    //static boolean i;
    public static void main(String args[]){
        int k=10;
        System.out.println(++k);  //11      ++k: k=k+1
        System.out.println(k++);  //11
        System.out.println(k);    //12
        //System.out.println("Pre increment of k is: " +k);
    }
}

// Object oriented principles:
// 1. Encapsulation : Wrapping up of variables and methods. Class is an example of encapsulation
// 2. Abstraction: Hiding of implementation, exposing only the interface

// Interface: It contains only abstract methods and constants
// Abstract Method: It will only have a declaration, no definition
