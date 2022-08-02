package Bai_3;

import java.util.Scanner;

public class PtBac2 {
    Scanner sc = new Scanner(System.in);
    private double a, b, c;

    public PtBac2() {
    }

    public void nhap() {
        System.out.println("Nhap phuong trinh bac 2: ax^2 + bx + c = 0");
        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();
        System.out.print("Nhap c: ");
        c = sc.nextDouble();
    }

    public void giai() {
        if (a == 0) {
            System.out.println("Day khong phai phuong trinh bac 2!");
        } else {
            double denta = b * b - 4 * a * c;
            if (denta > 0) {
                double x1 = (-b + Math.sqrt(denta)) / (2 * a), x2 = (-b - Math.sqrt(denta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:\nx1 = " + x1 + "\nx2= " + x2);
            } else if (denta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co 1 nghiem kep: x=" + x);
            } else
                System.out.println("Phuong trinh vo nghiem!");
        }
    }

    public void xuat() {
        System.out.println("Phuong trinh bac 2: " + a + "x^2 + " + b + "x + " + c + " = 0");
        giai();
    }

}
