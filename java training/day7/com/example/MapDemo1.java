package com.example;


import java.util.*;

public class MapDemo1 {

    public static void main(String[] args) {

        Integer k = 400;

        //Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map = new TreeMap<>();

        map.put(100, "Pen");
        map.put(200, "Pencil");
        map.put(300, "Rubber");
        map.put(k, "Mobile");
        map.put(500, "Laptop");

        System.out.println(map);

        System.out.println(map.get(k));

        map.put(400, "Desk");

        System.out.println(map.get(400));

        map.put(600, "Desk");

        System.out.println(map);

        map.remove(500);

        System.out.println(map);

        System.out.println(map.containsKey(500));
        System.out.println(map.containsValue("Desk"));

        Set<Integer> set = map.keySet();
        Iterator<Integer> itr = set.iterator();

        while (itr.hasNext()) {
            int key = itr.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }

        System.out.println("========================");


        Collection<String> values = map.values();
        Iterator<String> itr1 = values.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }


        System.out.println("========================");


        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr2 = entries.iterator();
        while (itr2.hasNext()) {
            Map.Entry<Integer, String> entry = itr2.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }


    }

}
