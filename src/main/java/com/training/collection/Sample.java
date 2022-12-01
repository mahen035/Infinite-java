package com.training.collection;

import org.example.Student;

import java.util.*;

public class Sample {
    public static void main(String args[]){

        Set<String> names = new TreeSet<>();
        names.add(new String("Adam"));
        names.add(new String("Sara"));
        names.add(new String("Kevin"));
        names.add(new String("Dan"));

        List<Integer> num = Arrays.asList(2,4,1,6);
        for(String name:names){
            System.out.println(name);
        }

        Set<Student> students = new TreeSet<>();

        students.add(new Student("Adam", 23, 'A'));
        students.add(new Student("Pete", 21, 'B'));
        students.add(new Student("Katie", 22, 'A'));
        students.add(new Student("Brian", 24, 'A'));

        for(Student student:students){
            System.out.println(student);
        }

        List<String> items= new ArrayList<>();
        items.add("Laptop");
        items.add("Desktop");
        items.add("keyboard");
        items.add("Laptop");

        items.add(2,"Mouse");

       // System.out.println("Removed item is: "+items.remove(1));

        items.set(3, "Speaker");

        for(String item : items){
            System.out.println(item);
        }


        /*Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String str = it.next();
        }*/
    }
}
// We should not put heterogeneous data in a collection
// Generics are compile time type safety
