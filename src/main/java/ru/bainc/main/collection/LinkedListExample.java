package ru.bainc.main.collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Ivan", 3);
        Student1 student2 = new Student1("Nikolay", 2);
        Student1 student3 = new Student1("Elena", 1);
        Student1 student4 = new Student1("Petr", 4);
        Student1 student5 = new Student1("Mariya", 3);
        LinkedList<Student1> student1LinkedList = new LinkedList<>();
        student1LinkedList.add(student1);
        student1LinkedList.add(student2);
        student1LinkedList.add(student3);
        student1LinkedList.add(student4);
        student1LinkedList.add(student5);
        System.out.println("LinkedList = " + student1LinkedList);
        System.out.println(student1LinkedList.get(2));
        Student1 student6 = new Student1("Zaur", 3);
        Student1 student7 = new Student1("Igor", 4);
        student1LinkedList.add(student6);
        System.out.println("LinkedList = " + student1LinkedList);
        student1LinkedList.add(1,student7);
        System.out.println("LinkedList = " + student1LinkedList);
        student1LinkedList.remove(3);
        System.out.println("LinkedList = " + student1LinkedList);

    }

}
