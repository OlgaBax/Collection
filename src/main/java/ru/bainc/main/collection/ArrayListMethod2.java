package ru.bainc.main.collection;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan",'m',22,3,8.3);
        Student student2 = new Student("Nikolay",'m',28,2,6.4);
        Student student3 = new Student("Elena",'f',19,1,8.9 );
        Student student4 = new Student("Petr",'m',35,4,7);
        Student student5 = new Student("Mariya",'f',23,3,7.4);
        ArrayList <Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        System.out.println(studentList);
        Student student6 = new Student("Mariya",'f',23,3,7.4);
        System.out.println(studentList);
//        studentList.remove(student6);
        System.out.println(studentList);
        int index = studentList.indexOf(student6);
        System.out.println(index);


    }
}
