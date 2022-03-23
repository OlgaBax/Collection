package ru.bainc.main.collection.set_interface;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet <Student> treeSet = new TreeSet<>();
        Student student1 = new Student("Zaur", 3);
        Student student2 = new Student("Mariya",  1);
        Student student3 = new Student("Sergey",  4);
        Student student4 = new Student("Igor", 5);
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        System.out.println(treeSet);
        Student student5 = new Student("Igor", 3);
        Student student6 = new Student("Igor", 5);
        System.out.println(student1.equals(student5));
        System.out.println(student1.hashCode() == student5.hashCode());



    }
}
