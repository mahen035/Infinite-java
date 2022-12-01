package com.training.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class Sample {
    public static void main(String args[]) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your dob (dd-MM-yyyy):");
        String dob = sc.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(dob);
        System.out.println("Converting to: yyyy-MM-dd ");
        String neFormat =  new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(neFormat);

    }
}

// Add dateOfJoining in the employee class with type Date. Whenever a new Employee object is created
// System date becomes the date of joining.
// while displaying Employee object convert this date into dd-MM-yyyy format.
