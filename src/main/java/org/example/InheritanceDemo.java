package org.example;

public class InheritanceDemo {
    public static void main(String args[]){
        Dog dog1 = new Dog("test",2);  // Parent class reference can refer to child class object
        dog1.name = "Ted";
        dog1.hairColor="Brown";
        System.out.println(dog1.getAnimalInfo());  //Dynamic Polymorphism
    }

}
