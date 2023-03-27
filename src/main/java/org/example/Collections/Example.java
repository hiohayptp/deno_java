package org.example.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        Random random = new Random();

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
        XuatList(listA);

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
        XuatList(listB);
        System.out.println();
        // A có B k có --> insert vào B
        for (Integer valueA : listA) {
            boolean check = false;
            for (Integer valueB : listB) {
                if (valueA == valueB) {
                    check = true;
                    break;
                }
            }
            if (check == false) {
                listB.add(valueA);
                System.out.print(valueA+ " ");
            }
        }
        XuatList(listB);
        System.out.println("//");
        // B có A k có --> xóa trong B
//        ArrayList<Integer> remove = new ArrayList<>();
//        for (Integer valueB : listB){
//            for (Integer valueA : listA) {
//                if (valueB == valueA) {
//                    remove.add(valueB);
//                    break;
//                }
//            }
//        }
//        listB.removeAll(remove);
//        System.out.println("B có A k có --> xóa trong B");
//        for (int i = listB.size(); i >= 0 ; i--) {
//            boolean check = false;
//            for (Integer valueA : listA) {
//                if (listB.get(i) != valueA) {
//                    check = true;
//                    break;
//                }
//            }if(check == false){
//                listB.remove(i);
//            }
//        }
        System.out.println("B có A k có --> xóa trong B");

        for (int i = listB.size()-1; i >= 0 ; i--) {
            boolean flag = false;
            for (Integer valueA : listA) {
                if (listB.get(i) == valueA) {
                    flag = true; // nếu trùng thì thoát vòng lặp
                    break;
                }
            }
            if (flag == false) {
                listB.remove(i);
            }
        }
       XuatList(listB);
        XuatList(listA);

    }
    public static void XuatList(List<Integer> list){
        System.out.println("//");

        for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
        }
    }
}
