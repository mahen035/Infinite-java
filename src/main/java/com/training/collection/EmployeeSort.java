package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {
    public static void main(String args[]){
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Tom", 10000));
        empList.add(new Employee(102, "Pete", 8000));
        empList.add(new Employee(103, "Dave", 8600));
        empList.add(new Employee(104, "Lucy", 20000));
        empList.add(new Employee(105, "Katie", 11000));

        //empList.add(2, new Employee(111, "Test", 1100));

        Collections.sort(empList);

        for(Employee emp:empList){
            System.out.println(emp);
        }
    }
}

// Create Employee class with fields empId, empName and salary
// While creating employee object if the empId already exist then
// throw a custom exception "IDExistException"
// and display a message "emp Id already exist"

// Steps: When you create new employee object, first create an EmpList ArrayList
// check EmpList to see if id already exist
// If it's there then throw the exception
// if id is not there then add a new object to the collection