package ru.bainc.main.collection;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<String>();// 2-ой стринг можно не писать.
//        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Olga");
        arrayList.add("Irina");
        arrayList.add("Petr");
        arrayList.add("Sergey");
        System.out.println(arrayList);

        ArrayList <Integer> arrayList1 = new ArrayList<>(200);
        ArrayList <String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Olga");
        arrayList2.add("Irina");
        arrayList2.add("Petr");

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList);
        System.out.println(arrayList3);
     }
}
