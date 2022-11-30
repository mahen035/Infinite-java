package com.training.wrapper;

import org.example.Student;

public class Sample {

    public static void main(String[] args){
       /* Integer i = new Integer(9);
        int s = i+21; // Autoboxing
        Integer i1 = new Integer('A');

        System.out.println(i1.intValue());  //unboxing*/
        Student stud1 = new Student("Neil", 23, 'A');
        Student stud2 = null;
    try {
         stud2 = (Student)stud1.clone();
    }
    catch(Exception e){
        e.printStackTrace();
    }
        stud2.setRollNo(11);

        System.out.println(stud1);
        System.out.println(stud2);

    }

}

//Create an account class with fields like account number,
//account name and balance and methods like deposit and withdraw.

// make Account class cloneable

// create object of account class, make some transaction for that day
// clone that object for next day transaction and so on..

/*
Create an account class with fields like account number,
account name and balance and methods like deposit and withdraw.
Need to create an object which will represent a day's transaction let
say "Nov20Trans" you will then create 2 cloned objects that represent
"Nov21Trans" and "Nov22Trans"
 */
