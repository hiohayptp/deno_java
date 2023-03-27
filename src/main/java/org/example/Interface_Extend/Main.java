package org.example.Interface_Extend;

public class Main{

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Hinh hcn = new HinhChuNhat(2,3);
                hcn.dienTich();
        System.out.println("Chu vi la " + hcn.chuVi());
        System.out.println("Dien tich la " + hcn.dienTich());

        Hinh ht = new HinhThoi(2,4,3);
        System.out.println("Chu vi la " + ht.chuVi());
        System.out.println("Dien tich la " + ht.dienTich());

        System.out.println("/1");
        XeMayImlp xm = new XeMayImlp();
        xm.loaiXe();
        xm.giaXe();
        xm.phanKhoi();

        System.out.println("/2");
        LoaiXe lx = new XeMayImlp();
        lx.loaiXe();
        XeMay xe = new XeMayImlp();
        xe.giaXe();
        xe.phanKhoi();


    }

}