package org.example.Java8Function;

import java.util.*;

public class ExampleMapToList {
    public static void main(String[] args) {
        HashMap<String, Integer> cars = new HashMap<String, Integer>();
        // preparing HashMap with keys and values
        cars.put("Volvo", 3);
        cars.put("BMW", 4);
        cars.put("Ford", 5);
        cars.put("Mazda", 6);
         System.out.println("Size of cars Map: " + cars.size());
        // 1st Example : chuyển đổi key
         Set<String> keySet = cars.keySet();
         List<String> carsKeyList = new ArrayList<>(keySet);
         System.out.println("Size of Key list from Map: " + carsKeyList.size());
         System.out.println("Printing HashMap keys from converted list : ");
         for (String key : carsKeyList) {
             System.out.println(key);
         }
         // 2nd Example : chuyển đổi value
         Collection<Integer> values = cars.values();
         List<Integer> carsValueList = new ArrayList<Integer>(values);
         System.out.println("Size of Value list from Map: " + carsValueList.size());
        // print values from list
         System.out.println("Printing HashMap values from converted list :");
         for (Integer value : carsValueList) {
             System.out.println(value);
         }
        // 3rd Example : Converting HashMap into ArrayList using Entry Set
         Set<Map.Entry<String, Integer>> set = cars.entrySet();
         List<Map.Entry<String, Integer>> schoolAgeCriteriaList = new ArrayList<>(set);
         Iterator<Map.Entry<String, Integer>> it = schoolAgeCriteriaList.iterator();
         while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println("Entry from converted list : " + entry);
         }
    }

}
