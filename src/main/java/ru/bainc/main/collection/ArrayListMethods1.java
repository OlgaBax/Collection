package ru.bainc.main.collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Olga");
        arrayList.add("Irina");
        arrayList.add("Petr");
        arrayList.add("Sergey");
        arrayList.add(1, "Misha");
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(0));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        arrayList.set(0, "Masha");
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.remove("Misha");
        System.out.println(arrayList);
    }
}
