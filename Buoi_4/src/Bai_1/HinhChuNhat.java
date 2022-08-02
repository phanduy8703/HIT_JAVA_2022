package Bai_1;

import java.util.Scanner;

public class HinhChuNhat {
    Scanner sc = new Scanner(System.in);
    private double dai;
    private double rong;

    public HinhChuNhat() {

    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        if (dai > 0) {
            this.dai = dai;
        } else {
            this.dai = 1;
        }
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        if (rong > 0) {
            this.rong = rong;
        } else {
            this.rong = 1;
        }
    }

    public void nhap() {
        do {
            System.out.print("Nhap chieu dai: ");
            dai = sc.nextDouble();
            System.out.print("Nhap chieu rong: ");
            rong = sc.nextDouble();
        } while (dai <= 0 || rong <= 0);
    }

    public double dienTich() {
        return dai * rong;
    }

    public double chuVi() {
        return (dai + rong) * 2;
    }

    public void xuat() {
        System.out.println("Chieu dai: " + dai);
        System.out.println("Chieu rong: " + rong);
        System.out.println("Dien tich: " + dienTich());
        System.out.println("Chu vi: " + chuVi());
    }
}
