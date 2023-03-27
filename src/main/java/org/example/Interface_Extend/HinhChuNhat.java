package org.example.Interface_Extend;

public class HinhChuNhat extends Hinh {
    private int height;

    private int width;

    protected String hd = "chu nhat";

    public HinhChuNhat(String hd) {
        this.hd = hd;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public HinhChuNhat() {
    }

    public HinhChuNhat(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public void hinhDang(){
        System.out.println("đay la hinh chu nhat");
    }

    @Override
    public int chuVi() {
        return (height + width)*2;
    }

    public int dienTich() {
        return 0;
    }
}

