package org.example.Collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        // Tạo 2 List
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        // Random 10 số
        for (int i = 0; i <10; i++) {
            listA.add((int) (Math.random() * 20));
            listB.add((int) (Math.random() * 20));
        }

        // Hiển thị ra 2 list
        XuatList(listA);
        XuatList(listB);

        // A khác B những element nào
        // A có nhưng B ko có => INSERT B
        for (Integer valueA : listA) {
            boolean flag = false;
            for (Integer valueB : listB) {
                if (valueA == valueB) {
                    flag = true; // nếu trùng thì thoát vòng lặp
                    break;
                }
            }
            if (flag == false) {
                listB.add(valueA);
            }
        }

        System.out.println();
        System.out.println("Cau 1: ");

        XuatList(listA);
        XuatList(listB);

        // B có nhưng A ko có => REMOVE B
        int lengthOfB = listB.size();
        for (int i = 0 ;i < lengthOfB ; i++) {
            boolean flag = false;
            for (Integer valueA : listA) {
                if (listB.get(i) == valueA) {
                    flag = true; // nếu trùng thì thoát vòng lặp
                    break;
                }
            }
            if (flag == false) {
                listB.remove(i);
                lengthOfB--;
            }
        }

        System.out.println();
        System.out.println("Cau 2: ");

        XuatList(listA);
        XuatList(listB);

    }

    public static void XuatList(List<Integer> list){
        System.out.println();
        for (Integer value : list) {
            if (value > 10)
                System.out.print(value + " ");
            else System.out.print(value + "  ");

        }
    }
}
