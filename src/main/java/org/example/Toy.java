package org.example;

public abstract class Toy {  // It should have at least one abstract method

    String name;
    String category;

    protected abstract void canPlay();

    public void getToyDetails(){
        System.out.println("Toy Details: "+name +": "+category);
    }
}
