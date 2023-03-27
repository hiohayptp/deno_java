package org.example.Collections;

import java.util.HashMap;

public class MainHashMap {
    public static void main(String[] args) {
        // key / value
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("Tam", 22);
        people.put("Phong", 20);
        people.put("Phan", 23);
        people.put("Thanh", 23);

        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }

        people.size();
        people.remove("Phong");
        people.get("Phong");

        for (String i : people.keySet()) {
            System.out.println(i);
        }

        for (Integer i : people.values()) {
            System.out.println(i);
        }

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
