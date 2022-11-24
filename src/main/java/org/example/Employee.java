package org.example;

public class Employee {   // Class name should always start with a capital letter

    private String empId; // variable should be in camelcase
    private String empName;
    private String designation;
    private double salary;

    private int hoursWorked;

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
                '}';
    }
}
