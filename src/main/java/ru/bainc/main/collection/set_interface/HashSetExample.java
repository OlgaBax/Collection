package ru.bainc.main.collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set< String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
//        System.out.println(set);
        for (String s:set)
        {
            System.out.println(s);
        }
        set.remove("Zaur");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Oleg"));
    }

}
