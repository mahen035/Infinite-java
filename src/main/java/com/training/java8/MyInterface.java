package com.training.java8;

@FunctionalInterface   // Annotations are instructions to the compiler
public interface MyInterface {
    int getSum(int a, int b);

    //Common behaviour in all implementing classes
    static void hello(){
        System.out.println("Static method example");
    }

    //Give default behaviour to implementing class if not overridden
    default void defMethod(){
        System.out.println("Default method example");
    }

}

//Interface: all methods are abstract
//Functional Interface: Only one method will be abstract

//static method
//default method

//Lambda Expression: converting a function into a corresponding lambda expression
