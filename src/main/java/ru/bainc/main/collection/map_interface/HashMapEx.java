package ru.bainc.main.collection.map_interface;

import java.util.HashMap;
import java.util.Map;


public class HashMapEx {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Zaur", "Tregulov", 3);
        Student student2 = new Student("Mariya", "Ivanova", 1);
        Student student3 = new Student("Sergey", "Pertov", 4);
        Student student4 = new Student("Oleg", "Sidorov", 3);
        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.2);
        map.put(student4, 6.3);
        Student student5 = new Student("Zaur", "Tregulov", 3);
        System.out.println(map);
        boolean result = map.containsKey(student5);
        System.out.println(result);
        System.out.println(student1.hashCode());
        System.out.println(student5.hashCode());

        Map<Integer, String> map1 = new HashMap<>(16, 0.75f);
    }

}



