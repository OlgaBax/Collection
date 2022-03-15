package ru.bainc.main.collection;
import java.util.List;
import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(2,3);// данная реализация метода add позволяет производить вставку элемента на конкретный индекс
        list.set(1,4); // метод set перезаписывает элемент на конкретном индексе, а не сдвигает его.
        list.add(2);
        list.add(7);
        System.out.println(list.get(0));
        System.out.println(list.size());

        for (int i = 0; i< list.size(); i++){
            System.out.println(list.get (i));
        }
    }
}
