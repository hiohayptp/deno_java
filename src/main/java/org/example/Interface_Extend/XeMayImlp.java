package org.example.Interface_Extend;

public class XeMayImlp implements XeMay, LoaiXe {
    @Override
    public void giaXe() {
        System.out.println("Gia xe: 150.000.000 VNĐ");
    }

    @Override
    public void phanKhoi() {
        System.out.println("Phan khoi: 150cc");
    }

    @Override
    public void loaiXe() {
        System.out.println("Loai xe : Honda");
    }
}
