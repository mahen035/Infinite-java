package com.training.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeData {

    public static void main(String args[]) throws IOException {
        String line = "";
       // Employee[] empList = new Employee[5];
        int i = 0;
        String[] employee = null;
        Employee[] empList = new Employee[3];
        BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
        while((line = reader.readLine())!=null){
            employee = line.split(",");
            //Read the String array and populate your Employee object
            empList[i] = new Employee(employee[0], employee[1], employee[2], Long.parseLong(employee[3]), Double.parseDouble(employee[4]), employee[5]);
            i++;
            /*System.out.println("Employee[FirstName = "+employee[0]+",LastName= "
                              +employee[1]+ ",Designation="+employee[2]
                    + ",Phone Number="+employee[3]+ ",Salary="+employee[4]
                    + ",Address="+employee[5]);*/

        }
        for(int j = 0; j<3; j++){
            System.out.println(empList[j]);
        }

    }
}
