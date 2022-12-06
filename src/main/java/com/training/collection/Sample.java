package com.training.collection;

import org.example.Student;

import java.util.*;

public class Sample {
    public static void main(String args[]){

        Set<String> names = new TreeSet<>();
        names.add(new String("Adam"));
        names.add(new String("Sara"));
        names.add(new String("Kevin"));
        names.add(new String("Dan"));

        List<Integer> num = Arrays.asList(2,4,1,6);
        for(String name:names){
            System.out.println(name);
        }

        List<Student> students = new ArrayList<>();

        students.add(new Student("Adam", 23, 'A'));
        students.add(new Student("Pete", 21, 'B'));
        students.add(new Student("Katie", 22, 'A'));
        students.add(new Student("Brian", 24, 'A'));

        Collections.sort(students);

        for(Student student:students){
            System.out.println(student);
        }

        List<String> items= new ArrayList<>();
        items.add("Laptop");
        items.add("Desktop");
        items.add("keyboard");
        items.add("Laptop");

        items.add(2,"Mouse");

       // System.out.println("Removed item is: "+items.remove(1));

        items.set(3, "Speaker");

        for(String item : items){
            System.out.println(item);
        }

        List<String> nameList = new LinkedList<String>();

        nameList.add("Rita");
        nameList.add("Rahul");
        nameList.add("Mohan");

        nameList.add(2, "Kyle");

        for(String name:nameList){
            System.out.println(name);
        }

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(111, "ONE");
        myMap.put(21, "TWO");
        myMap.put(31, "THREE");
        myMap.put(43, "FOUR");

       // System.out.println(myMap.get(32));

        for(Map.Entry<Integer, String> entry : myMap.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key is: "+key+ " Value is: "+value);
        }

        Employee emp1 = new Employee(111, "Kyle", 32000);
        Map<Integer, Employee> empMap = new HashMap<>();

        empMap.put(emp1.getEmpId(), emp1);

        System.out.println(empMap.get(111));

        Student stud1 = new Student("Rohan", 27, 'A');
        Student stud2 = new Student("Priya", 27, 'A');
        Student stud3 = new Student("John", 28, 'B');
        Student stud4 = new Student("Pete", 28, 'B');
        Student stud5 = new Student("Dave", 28, 'A');

        List<Student> studentList = new ArrayList<>();
        List<Student> studListA = new ArrayList<>();
        List<Student> studListB = new ArrayList<>();

        studentList.add(stud1);
        studentList.add(stud2);
        studentList.add(stud3);
        studentList.add(stud4);
        studentList.add(stud4);

        for(Student student : studentList){
            if(student.getGrade() == 'A'){
                studListA.add(student);
            }
            else if(student.getGrade() == 'B'){
                studListB.add(student);
            }
        }

        Map<Character, List<Student>> studMap = new HashMap<>();

        studMap.put('A', studListA);
        studMap.put('B', studListB);

      // Create separate Maps of student where the key will represent the grade and value will be all
        // students who has that grade


        /*Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String str = it.next();
        }*/
    }
}
// We should not put heterogeneous data in a collection
// Generics are compile time type safety
