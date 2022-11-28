package org.example;

public class Student {

    Student(String studName, int rollNo, char grade){
       this.studName = studName;
       this.rollNo = rollNo;
       this.grade = grade;
    }

    Student(){

    }
    private String studName;   // Instance variable
    private int rollNo;       // Instance variable

    private char grade;      // Instance variable
    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    //Attributes


    @Override
    public String toString() {
        return "Student{" +
                "studName='" + studName + '\'' +
                ", rollNo=" + rollNo +
                ", grade=" + grade +
                '}';
    }

    static String collegeName;




    //1. Create a java class and add two numbers inside main method and show the result


    //Behaviour


}

//Access Specifiers:
//1. public: This can be accessed from anywhere
//2. protected: This can be accessible from within the same package and from any subclass outside of the package
//3. default: It can be accessible only within the same package
//4. private: It can be accessed within the same class


// Java bean Standard

// Conditional controls: If-else, switch-case, break, continue, Loops(while, for, do-while)

// display table of 5 using while loop
// 5 * 1 = 5
// 5 * 2 = 10
//......
// 5 * 10 = 50

