package com.training.java8;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaDemo {

    public static void main (String args[]){
        //LambdaDemo obj = new LambdaDemo();
        //obj.getSum(10,20);

        Consumer<String> con = n -> System.out.println(n);

        con.accept("Hello");

        Predicate<Integer> obj1 = x -> x%2 != 0;

        System.out.println(obj1.test(32));

        MyInterface obj = (a, b) -> {
           // System.out.println("First Number: " + a);
            if(a>b){
                return a;
            }
            else{
                return b;
            }
          // return a + b; //Return type of a lambda expression is a functional interface
        };
        System.out.println("Greater of two numbers is: "+obj.getSum(20,30));
    }

   /* int getSum(int a, int b){
        return a+b;
    }*/

// when only one statement is there in the method, no need for the curly braces (that is optional)
// When you provide body to lambda expression, return statement is mandatory

}

// Create a functional interface that takes two numbers and return a number.
// Associate it with a lambda expression where you compare two numbers and returns the greater one

//Inbuilt Functional Interfaces:
//1. Predicate: It will take a value as argument and returns a boolean
//2. Consumer: It takes a value and consumes it without returning anything

//Write lambda expressions that will return BiPredicate, Supplier, IntConsumer, DoubleFunction

//java.util.function

// Functional Interface
// Lambda Expression
// VarArgs
// Static and default methods
// Stream API