package ru.bainc.main.collection.map_interface;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double,Student> ht = new Hashtable<>();
        Student student1 = new Student("Zaur", "Tregulov", 3);
        Student student2 = new Student("Mariya", "Ivanova", 1);
        Student student3 = new Student("Sergey", "Pertov", 4);
        Student student4 = new Student("Igor", "Sidorov", 3);

        ht.put(7.2,student3);
        ht.put(7.5,student4);
        ht.put(5.8,student1);
        ht.put(6.4,student2);
        System.out.println(ht);
    }
}
