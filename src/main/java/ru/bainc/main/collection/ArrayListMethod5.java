package ru.bainc.main.collection;

import java.util.ArrayList;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Olga");
        arrayList1.add("Irina");
        arrayList1.add("Petr");
        arrayList1.add("Sergey");
        arrayList1.add("Kolya");
//        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Olga");
        arrayList2.add("Irina");
        arrayList2.add("Igor");

//        arrayList1.removeAll(arrayList2); // из лист1 удаляются все элементы лист2
//        System.out.println(arrayList1);

//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);

    }
}
