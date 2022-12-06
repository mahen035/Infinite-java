package com.training.collection;

import com.training.exception.MyException;

import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) throws MyException {
        ArrayList<Employee> employees =new ArrayList<>();
        Employee e1 =new Employee(01,"Abhi",2000);
//        Employee e2=null;
//        Employee e3=null;
        employees.add(e1);
        Scanner sc=new Scanner(System.in);
        //  int i=1;
        //      try{
        //System.out.println("Enter Q to Quit");
        while (true){
            System.out.println("Enter Employee ID");
            int emplId= sc.nextInt();
            System.out.println("Enter Employee Name");
            String emplName= sc.next();
            System.out.println("Enter Employee Salary");
            double salary= sc.nextDouble();
            for(Employee employee:employees) {
                try {

                    if (employee.getEmpId() == emplId) {
                        throw new MyException("emp Id already exist");
                        // break;
                    } else {
                        employees.add(new Employee(emplId, emplName, salary));
                        System.out.println(employees);
                    }

                }
                catch (MyException e){
                    System.out.println(e);
                    //break;
                }
            }
            System.out.println("Q to quite");
            char choice = sc.next().charAt(0);
            if(choice=='Q'){
                break;
            }


        }

        //    }
    }
}