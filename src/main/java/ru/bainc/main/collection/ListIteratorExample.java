package ru.bainc.main.collection;
/** Определить является ли слово палиндромом.
 *
 */

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) { // переводим String s в массив символов-char.
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator(); // создаем листИтератор из символов char ch с начала массива
        ListIterator<Character> reverseIterator = list.listIterator(list.size()); // создаем 2-ой листИтератов с конца массива
        boolean isPalindrom = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) { // проверяем есть ли предыдущий и следующий элементы
            if (iterator.next() != reverseIterator.previous()) { // берем эти элементы и сравниваем, если не равны, то false
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not palindrom");
        }
    }
}
