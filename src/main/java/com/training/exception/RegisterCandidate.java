package com.training.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class RegisterCandidate {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Candidate name");
        String name = sc.next();
        char gender = 'T';
        double salary = 0.0;
        boolean flag = true;
try {
    if (!name.matches("^[a-zA-Z]*$")) {
        flag = false;
        throw new InputMismatchException();
    }
        System.out.println("Enter gender:");
         gender = sc.next().charAt(0);
         //System.out.println("Gender: "+gender);
        if(!(gender == 'M' || gender == 'F')){
            flag = false;
            throw new InputMismatchException();
        }
        System.out.println("Enter Salary");
         salary = sc.nextDouble();
        if(salary < 10000){
            flag = false;
            throw new InvalidSalaryException("Salary cannot be less than 10000");
        }
}
catch(InputMismatchException | InvalidSalaryException e){
        if(e instanceof  InputMismatchException){
            flag = false;
            System.out.println("Incorrect Input!!");
        }
        else if(e instanceof  InvalidSalaryException ){
            System.out.println(e);
        }
}

if(flag){
    Candidate c1 = new Candidate(name, gender, salary);
    System.out.println(c1);
}

    }
}
