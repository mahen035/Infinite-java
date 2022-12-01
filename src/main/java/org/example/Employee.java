package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {   // Class name should always start with a capital letter

    private String empId; // variable should be in camelcase
    private String empName;
    private String designation;
    private double salary;

    private Date doj;

    private int hoursWorked;

    public Employee(String empId, String empName, String designation, double salary, Date doj) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
        this.doj = doj;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        if(designation.equals("manager")){
            this.salary = hoursWorked * 2000;
        }
        if(designation.equals("consultant")){
            this.salary = hoursWorked * 1500;
        }
        if(designation.equals("developer")){
            this.salary = hoursWorked * 1000;
        }
        if(designation.equals("trainee")){
            this.salary = hoursWorked * 500;
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", doj=" + new SimpleDateFormat("dd-MM-yyyy").format(doj) +
                '}';
    }
}

// File I/O: Standard IO, FileInputStream, FileOutputStream, BufferedReader,
// Serialization, Marker Interfaces
// How to read csv file and save data in java object
// How to parse String to Date ?
// How to format Date to String ?
