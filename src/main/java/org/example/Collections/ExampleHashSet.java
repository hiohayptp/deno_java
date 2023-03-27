package org.example.Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class ExampleHashSet {
    public static void main(String[] args) {

        HashSet<Integer> listA = new HashSet<>();
        HashSet<Integer> listB = new HashSet<>();
        Random random = new Random();
        //List A
        while (listA.size() < 5){
            Integer a = random.nextInt(20) + 1;
            boolean check = false;
            for(Integer el : listA){
                if (a == el) {
                    check = true;
                    break;
                }
            }
            if(check == false){
                listA.add(a);
            }
        }
        System.out.println("List A đã random là: "+ listA);

        // list B
        while (listB.size() < 5){
            Integer b = random.nextInt(20) + 1;
            boolean check = false;
            for(Integer el : listB){
                if (b == el) {
                    check = true;
                    break;
                }
            }
            if(check == false){
                listB.add(b);
            }
        }
        System.out.println("List B đã random là: "+ listB);
        // A có B k có --> insert vào B
        String[] array = new String[listA.size()];
        listA.toArray(array);
        String[] array1 = new String[listA.size()];

        listB.toArray(array1);
        System.out.println(array);
        System.out.println(array1);
//        for (int i = listB.size()-1; i >= 0 ; i--) {
//            boolean flag = false;
//            for (Integer valueA : listA) {
//                if (listA.toArray()== valueA) {
//                    flag = true; // nếu trùng thì thoát vòng lặp
//                    break;
//                }
//            }
//            if (flag == false) {
//                listB.remove(i);
//            }
//        }
    }
    public static void XuatList(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
