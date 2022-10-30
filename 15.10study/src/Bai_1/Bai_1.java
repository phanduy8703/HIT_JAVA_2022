package Bai_1;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhChuNhat a = new HinhChuNhat();
        System.out.println("Nhap hinh chu nhat 1!");
        a.nhap();
        HinhChuNhat b = new HinhChuNhat();
        double dai, rong;
        do {
            System.out.println("Nhap hinh chu nhat 2!");
            System.out.print("Nhap chieu dai: ");
            dai = sc.nextDouble();
            System.out.print("Nhap chieu rong: ");
            rong = sc.nextDouble();
        } while (dai <= 0 || rong <= 0);
        b.setDai(dai);
        b.setRong(rong);
        System.out.println("Hinh 1");
        a.xuat();
        System.out.println("-----------------");
        System.out.println("Hinh 2");
        System.out.println("Chieu dai: " + b.getDai());
        System.out.println("Chieu rong: " + b.getRong());
        System.out.println("Chu vi: " + b.chuVi());
        System.out.println("Dien tich: " + b.dienTich());
        if (a.dienTich() < b.dienTich())
            System.out.println("Dien tich hinh 2 lon hon! Dien tich hinh 2 = " + b.dienTich());
        else if (a.dienTich() > b.dienTich())
            System.out.println("Dien tich hinh 1 lon hon! Dien tich hinh 1 = " + a.dienTich());
        else
            System.out.println("Dien tich 2 hinh bang nhau! Dien tich 2 hinh = " + a.dienTich());
    }
}
