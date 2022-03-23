package ru.bainc.main.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set <String> countryTreeSet = new TreeSet<>();
        countryTreeSet .add("Russia");
        countryTreeSet .add("France");
        countryTreeSet .add("Italy");
        countryTreeSet .add("Spain");
        countryTreeSet .add("England");
        for (String s: countryTreeSet)
        {
            System.out.println(s);
        }
    }
}
