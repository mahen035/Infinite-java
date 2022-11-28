package org.example;

public class Reference {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        getUpdate(a,b);
        String str1 = new String("Hello");
        updateString(str1);
        Student std1 = new Student("Sai", 112, 'B');
        updateStudent(std1);
        System.out.println(std1);

        System.out.println(str1);
        System.out.println(a);
        System.out.println(b);
    }

    static void getUpdate(int x, int y){
        x = x+10;
        y = y+20;
    }

    static void updateString(String str){
        str.concat("World");
    }

    static void updateStudent(Student std){
        std.setGrade('E');
    }
}

// Primitive data types will always be passed by value but Reference types will copy the same reference and hence
// changes made inside the class will update the original object also.