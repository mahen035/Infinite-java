package com.training.io;

public class Employee {

    private String fName;
    private String lName;
    private String designation;
    private long phNo;
    private double salary;
    private String address;

    public Employee(String fName, String lName, String designation, long phNo, double salary, String address) {
        this.fName = fName;
        this.lName = lName;
        this.designation = designation;
        this.phNo = phNo;
        this.salary = salary;
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", designation='" + designation + '\'' +
                ", phNo=" + phNo +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
