package com.training.collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentCollection {

    public static void main(String args[]){
        Student stud1 = new Student(101,"Raj",23, "SNDT");
        Student stud2 = new Student(102,"Mohan",23, "NIT");
        Student stud3 = new Student(103,"Kamal",23, "DCE");
        Student stud4 = new Student(104,"Kishore",23, "NIT");
        Student stud5 = new Student(105,"Priya",23, "DCE");
        Student stud6 = new Student(106,"Kapil",23, "NIT");
        Scanner sc= new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);
        students.add(stud6);
        List<Student> sameCollegeList = new ArrayList<>();
        System.out.println("Enter the college name");
        String cName = sc.next();
        for(Student student:students){
            if(student.getCollegeName().equalsIgnoreCase(cName)){
                sameCollegeList.add(student);
            }
        }

        for(Student stud:sameCollegeList){
            System.out.println(stud);
        }

    }

}
