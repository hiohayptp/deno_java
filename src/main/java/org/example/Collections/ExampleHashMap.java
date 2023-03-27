package org.example.Collections;

import java.util.HashMap;
import java.util.Random;

public class ExampleHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> listA = new HashMap<>();
        HashMap<Integer,Integer> listB = new HashMap<>();
        Random random = new Random();
        //List A
        while (listA.size() < 5){
            Integer a = random.nextInt(20) + 1;
                listA.put(a,null);
        }
        System.out.println("List A đã random là: "+ listA.keySet());
        // list B
        while (listB.size() < 5){
            Integer b = random.nextInt(20) + 1;
                listB.put(b,null);
        }
        System.out.println("List B đã random là: "+ listB.keySet());
        System.out.println("/////////////////////////");
        for (Integer valueA : listA.keySet()) {
                listB.put(valueA,null);
        }
        System.out.println("A có B k có --> insert vào B: "+ listB.keySet());
        HashMap<Integer,Integer> listC = new HashMap<>();

        for (Integer valueB : listB.keySet()) {
            boolean check =  false;
            for (Integer valueA : listA.keySet()) {
                if (valueB == valueA) {
                    listC.put(valueB,null);
                    break;
                }
            }
        }
        System.out.println("list C: "+ listC.keySet());
        listB.remove(listC.keySet());
        System.out.println("B có A k có --> xóa trong B: "+ listB.keySet());

    }
}
