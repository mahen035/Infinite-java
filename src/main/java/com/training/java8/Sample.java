package com.training.java8;

public class Sample {
    public static void main(String... args){
        Sample obj = new Sample();
        obj.getVal(1);
        obj.getVal(1, 4);
        obj.getVal(1, 4, 5);

    }

    int getVal(int a, int... value){
        if(value.length==0)
            System.out.println("Variable Argument");
        return 350;
    }

   /* int getVal(int a){
        System.out.println("One Argument");
        return a;
    }

    int getVal(int a, int b){
        System.out.println("Two Argument");
        return a+b;
    }*/
}

//varargs: Variable Arguments
// Rules associated with varargs:
//1. vargargs variable should always be the last variable in parameter list
//2. there can be only one variable args in a method

// Create a method with variable arguments where if no parameter is passed
// then a welcome message will be displayed.
// for single parameter: add 10 and display
// for two parameters: average of the numbers
// for three parameters: sum of the numbers

// Stream API: Streams will operate on Collection
// Intermediate operations: transform the collection
// Terminal Operations : End the stream
// There can be n number of intermediate operation but only one terminal operation
