package org.example;

import java.util.Date;

public class EmployeeTest {

    public static void main(String args[]){
        Employee emp1 = new Employee("101", "Joel", "Manager", 100000, new Date());
        System.out.println(emp1);
    }
}
