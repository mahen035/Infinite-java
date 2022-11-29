package com.training.exception;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Sample {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");

        int age = sc.nextInt();
        try {

            if(age < 18){
            throw new MyException("Age should not be less than 18");
        }

        Sample sample = new Sample();
            sample.update();
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException | MyException e){
            if(e instanceof ArithmeticException) {
                System.out.println("Arithmetic Exception");
                System.out.println(e.getMessage());
            }
            else if(e instanceof  ArrayIndexOutOfBoundsException)
                System.out.println("ArrayIndexOutofBoundsException");
            else if(e instanceof  MyException)
                System.out.println(e);
        }

       finally{
            System.out.println("Inside Finally::"); // Release the resources. Ex: close file, close open db connection
        }

        System.out.println("Program continues...");
    }

    public void update() throws ArithmeticException, NumberFormatException, InputMismatchException {
        int x = 0;
        int y = 5 / x;
        System.out.println("Value of y is: " + y);
    }
}
