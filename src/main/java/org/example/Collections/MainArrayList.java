package org.example.Collections;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        //thêm
        cars.add("xe may");
        cars.add("Xe ga");
        cars.add("Xe hơi");
        cars.add("xe may");


        //xóa

        String remove = cars.remove(1);
        System.out.println("phan tu bi xoa: " + remove);

        boolean isRemove = cars.remove("xe may");
        if (isRemove) {
            System.out.println("Xoa thanh cong ");
        }
        System.out.println("phan tu con lai: ");
        for (String i : cars){
            System.out.println(i);
        }


        boolean isRemoveAll = cars.removeIf(t -> t.equals("xe may"));
        if (isRemoveAll) {
            System.out.println("Xoa thanh cong ");
        }
        System.out.println("phan tu con lai: ");
        for (String i : cars){
            System.out.println(i);
        }

        // tìm kiếm trả về vị trí

        int isFind = cars.indexOf("Xe hơi");
        System.out.println(isFind);

        // tìm kiếm trả về giá trị tại vị trí

        String findid = cars.get(2);
        System.out.println("find :"+ findid);

        //update phần tử

        String setData = cars.set(1, "Honda");
        for (String i : cars){
            System.out.println(i);
        }


    }
}
