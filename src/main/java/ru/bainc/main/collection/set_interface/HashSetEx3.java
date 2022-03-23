package ru.bainc.main.collection.set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx3 {
    public static void main(String[] args) {
        Set<String> countryHashSet = new HashSet<String>();
        countryHashSet.add("Russia");
        countryHashSet.add("France");
        countryHashSet.add("Italy");
        countryHashSet.add("Spain");
        countryHashSet.add("England");
        Iterator<String> iterator = countryHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String s: countryHashSet
             ) {
            System.out.println(s);

        }


    }
}
