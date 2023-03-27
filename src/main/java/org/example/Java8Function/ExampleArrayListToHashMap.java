package org.example.Java8Function;

import java.util.ArrayList;
import java.util.HashMap;

public class ExampleArrayListToHashMap {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        HashMap<String, String> hashMap = new HashMap<>();

        HashMap<String,String> array = new HashMap<>();

        for (String key:cars) {
            array.put(key,null);
        }
        System.out.println("Array " +array);
        System.out.println("Array Key" +array.keySet());

    }
}
