package ru.bainc.main.collection.map_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.put(985214, "Nikolay Petrov");
        System.out.println(map1);
        map1.putIfAbsent(1000, "Oleg Perov");
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(6578);
        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.containsKey(5000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry);
        }
        Iterator<Map.Entry<Integer, String>> iterator = map1.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry);
         }



    }

}
