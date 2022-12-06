package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String... args){
        List<Integer> numbers = Arrays.asList(23,21,4,8,25,6);
        Stream<Integer> numbersStream = numbers.stream(); // This will create a Stream for numbers collection

        //numbersStream.filter(x->x%2==0).map(x->x*10).sorted().forEach(System.out::println);

        //List<Integer> sortedNumbers = numbersStream.filter(x->x%2==0).map(x->x*10).sorted().collect(Collectors.toList());

        //numbersStream.close();
        List<String> names = Arrays.asList("Sam","Adam", "Sara", "Kyle");

        names.stream().filter(n->n.startsWith("S")).map(x->x+" Moris").sorted().forEach(System.out::println);

        int sum = numbersStream.filter(x->x%2==0).reduce(0, (a,b)->a+b);

        System.out.println("Sum of all the even numbers is: "+sum);


    }

}

// Create a collection of Student object then stream through it and filter out only the 'A' grade students.


// create a Stream of String Collection and filter all the names that start with 'S'
// and then appent 'Moris' to all those names and then display
