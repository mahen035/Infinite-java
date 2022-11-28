package org.example;

public class Animal {   //Generic

    String name;
    String hairColor;
    Animal(String name, int age){
        System.out.println("Animal Constructor with parameters");
    }
    public String getAnimalInfo(){
        return name+": "+hairColor;
    }
}
