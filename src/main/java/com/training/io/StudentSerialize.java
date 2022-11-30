package com.training.io;

import java.io.*;

public class StudentSerialize {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Student stud1 = new Student("Rohan", 23, 'A');

        FileOutputStream out = new FileOutputStream("serial");

        ObjectOutputStream objectOut = new ObjectOutputStream(out);

        objectOut.writeObject(stud1);

        objectOut.flush();
        objectOut.close();

        Student newStudent;

        FileInputStream in = new FileInputStream("serial");

        ObjectInputStream objectIn = new ObjectInputStream(in);

        newStudent = (Student)objectIn.readObject();

        objectIn.close();

        System.out.println(newStudent);


    }
}
