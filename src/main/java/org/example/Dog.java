package org.example;

public class Dog extends Animal{

    Dog(String str, int age){
        super(str, age);
        System.out.println("Dog Constructor::");
    }

    public String getAnimalInfo(){  // Method overriding
        return "Overriding getAnimalInfo method";
    }
}
