package Bai_1;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhChuNhat a = new HinhChuNhat();
        a.nhap();
        HinhChuNhat b = new HinhChuNhat();
        double dai, rong;
        do {
            System.out.print("Nhap chieu dai: ");
            dai = sc.nextDouble();
            System.out.print("Nhap chieu rong: ");
            rong = sc.nextDouble();
        } while (dai <= 0 || rong <= 0);
        b.setDai(dai);
        b.setRong(rong);
        System.out.println("Hinh 1");
        System.out.println("Chieu dai: " + a.getDai());
        System.out.println("Chieu rong: " + a.getRong());
        System.out.println("Dien tich: " + a.dienTich());
        System.out.println("Chu vi: " + a.chuVi());
        System.out.println("Hinh 2");
        b.xuat();

        if (a.dienTich() > b.dienTich())
            System.out.println("Dien tich a lon hon! Dien tich a bang: " + a.dienTich());
        else if (a.dienTich() == b.dienTich())
            System.out.println("Dien tich 2 hinh bang nhau bang: " + a.dienTich());
        else
            System.out.println("Dien tich b lon hon! Dien tich b bang: " + b.dienTich());
    }
}
