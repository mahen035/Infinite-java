package com.training.exception;

public class Candidate {

    private String name;
    private char gender;
    private double salary;

    public Candidate(String name, char gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}



/*

create a Candidate class with name,
gender and salary field. name should
have only alphabets or else it will throw "InputMismatchException",
gender should be 'M' or 'F' or lelse it will also throw "InputMismatchException"
and if the salary is less than 10000, it will throw user defined "InvalidSalaryException"
with a message that "Salary can not be less than 10000"


 */