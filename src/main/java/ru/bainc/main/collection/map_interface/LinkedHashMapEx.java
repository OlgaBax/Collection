package ru.bainc.main.collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<> (16,0.75f,true);
        /*
        если так создавать объект, то будет храниться информация о порядке использования элементов
         можно создавать объект и так LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>();
         */
        Student student1 = new Student("Zaur", "Tregulov", 3);
        Student student2 = new Student("Mariya", "Ivanova", 1);
        Student student3 = new Student("Sergey", "Pertov", 4);
        Student student4 = new Student("Igor", "Sidorov", 3);

        lhm.put(7.2,student3);
        lhm.put(7.5,student4);
        lhm.put(5.8,student1);
        lhm.put(6.4,student2);
        System.out.println(lhm); // выводятся на печать в порядке добавления.

        System.out.println(lhm.get(6.4));
        System.out.println(lhm.get(7.5));
        System.out.println(lhm.get(7.2));
        System.out.println(lhm.get(5.8));
        System.out.println(lhm); // выводятся не печать в порядке использования.

    }
}
