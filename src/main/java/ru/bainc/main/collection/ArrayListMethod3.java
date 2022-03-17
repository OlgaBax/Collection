package ru.bainc.main.collection;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Olga");
        arrayList1.add("Irina");
        arrayList1.add("Petr");
        arrayList1.add("Sergey");
        arrayList1.add("Sergey");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        arrayList1.addAll(1,    arrayList2);
        System.out.println(arrayList1);
//        System.out.println(arrayList1.indexOf("Irina"));
//        System.out.println(arrayList1.lastIndexOf("Sergey"));
//        System.out.println(arrayList1.size());
//        System.out.println(arrayList1.isEmpty());
//        System.out.println(arrayList1.contains("Irina"));
//        System.out.println(arrayList1.contains("Ivan"));
//
    }

}
