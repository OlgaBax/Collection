package ru.bainc.main.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod5_1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Olga");
        arrayList1.add("Irina");
        arrayList1.add("Petr");
        arrayList1.add("Sergey");
        arrayList1.add("Kolya");
        System.out.println("ArrayList raven  "+ arrayList1);
        Object [] array = arrayList1.toArray(); // из листа получается массив типа Object
        String[]array2 = arrayList1.toArray(new String [5]);// из листа полуается массив String
        for (String s : array2){
            System.out.println(s);
        }
       List <String> myList = arrayList1.subList(1,4);
        System.out.println("SubList raven "+ myList);
        myList.add("Fedor");
        System.out.println("SubList raven "+ myList);
        System.out.println("ArrayList raven  " + arrayList1);
      //  arrayList1.add("Sveta"); так делать нельзя. Выбросится ошибка.



    }
}
