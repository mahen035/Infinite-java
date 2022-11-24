package org.example;   //Package in java is like folder in windows which will resolve any namespace conflicts

import java.util.Scanner;
public class Main {   // Java class
    public static void main(String[] args) {  // Entry point for any java application


        /*int count = 1;  // Initialization

        while(count < 11){  // Condition : use while when you don't know exact number of iterations
            System.out.println("Count value: "+count);
            count++;    // Increment
        }*/

        for(int k = 1; k < 11; k++){  //When we know exact number of iterations we use for loop
            if(k%2==0){
                continue;
            }
            System.out.println(k);
          //  if(k == 6){
               // break;   // break will always be associated with a condition to break away from the loop
               // continue;
           // }
        }

        int count = 1;

        do{
            System.out.println(count);
            count++;
        }while(count < 11);

        Student stud1 = new Student("Peter", 101, 'A');
        Student stud2 = new Student("John", 102, 'E');

        Student.collegeName = "JNTU";

       /* if(stud1.getGrade()=='A'){
            if(stud1.getStudName().startsWith("p")){

            }
            else{

            }
            System.out.println("Student 1 is a very good student");
        }
        else{
            System.out.println("Student 1 is just an average student");
        }*/

        switch (stud2.getGrade()){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            default:
                System.out.println("No Match");
        }

       /* stud1.setStudName("Peter");
        stud1.setRollNo(101);
        stud1.setGrade('A');

        stud2.setStudName("John");
        stud2.setRollNo(102);
        stud2.setGrade('B');*/

        Main m1 = new Main();

        m1.getMessage();
       //String name1 = args[0];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name =  sc.next();     // Local variable

        System.out.println("Entered name is: "+name);
       /* int i = 89;
        byte b = (byte)i;  // Explicit type conversion/casting

        String message = "This is my first java code";  // Non primitive

        Student stud1 = new Student(); // Non primitive - Reference type

        System.out.println("Hello world! "+name1);*/
        name = "Dave";
    }

    public void getMessage(){
        System.out.println("Calling a method from main method..");

    }
}

// JVM: Convert the bytecode to machine understandable code, memory management
// JRE: Java Runtime Environment : Provide you all the runtime libraries to run your code.
// JDK: Java Development Kit: Provides an environment to develop our java code.
// Type of variables
// Data types: primitives and non primitives
// Types of languages
// Java architecture
// Access specifiers
// java bean standard : getters and setters
// Methods and how to access methods using objects