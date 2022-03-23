package ru.bainc.main.collection.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
//        TreeMap<Student, Double> treeMap1 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return this.;
//            }
//        }

        Student student1 = new Student("Zaur", "Tregulov", 3);
        Student student2 = new Student("Mariya", "Ivanova", 1);
        Student student3 = new Student("Sergey", "Pertov", 4);
        Student student4 = new Student("Igor", "Sidorov", 3);
        Student student5 = new Student("Vasiliy", "Smirmov", 3);
        Student student6 = new Student("Sasha", "Kapustin", 3);
        Student student7 = new Student("Elena", "Sidorova", 3);
        treeMap.put(student1, 5.8);
        treeMap.put(student3, 7.2);
        treeMap.put(student5, 7.9);
        treeMap.put(student2, 6.4);
        treeMap.put(student7, 9.1);
        treeMap.put(student4, 7.5);
        treeMap.put(student6, 8.2);
        System.out.println(treeMap);
    }

    }
