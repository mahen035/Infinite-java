package org.example;
import java.util.Scanner;
public class CourseTest {

    public static void main(String args[]){
        Course course1 = new Course(101, "JAVA", 500);
        Course course2 = new Course(102, "C++", 300);
        Course course3 = new Course(103, "HTML", 100);
        Course course4 = new Course(104, "JAVASCRIPT", 250);
        Course course5 = new Course(105, "CSS", 150);

        Course[] courses = {course1, course2, course3, course4, course5};
        boolean isCourseAvailable = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("1:Search by courseId  2:Search by courseName");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter courseId");
            int id = sc.nextInt();
            for(int i=0;i<5;i++){
                if(id==courses[i].getCourseId()){
                    System.out.println(courses[i]);
                    isCourseAvailable = true;
                }
            }
        }

        else if(choice == 2){
            System.out.println("Enter courseName");

            String name = sc.next();
            for(int i=0;i<5;i++){
                if(name.equals(courses[i].getCourseName())){
                    System.out.println(courses[i]);
                    isCourseAvailable = true;
                }

            }

        }

        else{
            System.out.println("INVALID INPUT!!");
        }

        if(isCourseAvailable == false){
            System.out.println("COURSE NOT AVAILABLE!!");
        }

    }
}

//1. Create Course class with fields and getter setters
//2. Create 5 courses
//3. Apply the logic

// find average of 5 numbers:
// find average age of 5 employees: age from employee
//