package ru.bainc.main.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Olga");
        arrayList1.add("Irina");
        arrayList1.add("Petr");
        arrayList1.add("Sergey");
        arrayList1.add("Kolya");
        Iterator<String> iterator = arrayList1.iterator();
//      while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        while (iterator.hasNext()){
            iterator.next(); //получаем элемент
            iterator.remove(); // удаляем эленент. Нельзя удалить элемент не получая его.
                                // т.е. сначала должен идти  .next(), потом .remove()
        }
        System.out.println(arrayList1);
    }
}
