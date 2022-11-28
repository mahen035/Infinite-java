package org.example;
import java.util.Scanner;
public class Sample{

    //static boolean i;
    //a[1]
    public static void main(String args[]){
       String msg = "Hello";   // Strings are immutable : cannot be changed once created
       String newMsg = msg.concat("There");
      // System.out.println(newMsg);
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        String[] aNames = new String[5];
       String message = "Multiple inheritance is not supported in java";

       // Take 5 names from the user as input and save then in a String array.
        System.out.println("Enter 5 names:");
        for(int i = 0; i<5; i++){
            String name = sc.next();
            names[i] = name;
        }
        int k = 0;
        for(int i = 0; i<5; i++){
            if(names[i].startsWith("A")){
                aNames[k] = names[i];
                k++;
            }
        }

        System.out.println("Length of new array: "+aNames.length);

       for(int i = 0; i<5; i++) {
            System.out.println(aNames[i]);
        }

       // replace all p in this string with 'k';

    //  message =  message.replace('p', 'k');

      //  System.out.println(message);

      //Arrays: Collection of similar data types

      String[] numbers = new String[6];    // This will block 24 bytes in memory

      //System.out.println(numbers[2]);  //Output: null
      String[] words = new String[7];

      words = message.split(" ");

      for(int i=0;i< words.length;i++){
        //  System.out.println(words[i]);
      }

    }
    @Override
    public String toString() {
        return "New Sample object..";
    }
}

// Take 5 names from the user as input and save then in a String array.

// save all the names that start with 'A' in a new array

// Take 5 Student objects in an array and filter out only those students who have got grade 'A'



// Object oriented principles:
// 1. Encapsulation : Wrapping up of variables and methods. Class is an example of encapsulation
// 2. Abstraction: Hiding of implementation, exposing only the interface

// Interface: It contains only abstract methods and constants
// Abstract Method: It will only have a declaration, no definition

// 3. Inheritance: "IS-A" relation Ex: Cat is an animal, Manager is an Employee
// Types of inheritance: Single inheritance, multi-level inheritance
// multiple inheritance is not supported in java : two parents :class A extend class B implements Interface1
