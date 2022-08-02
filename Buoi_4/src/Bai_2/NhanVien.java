package Bai_2;

import java.util.Scanner;

public class NhanVien {
    Scanner sc = new Scanner(System.in);
    private static int temp = 1;
    private int maNV, tuoi;
    private String ten, diaChi, boPhan;

    public NhanVien() {
        maNV = temp++;
    }

    public void nhap() {
        System.out.println("Them nhan vien!");
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        do {
            System.out.print("Nhap tuoi: ");
            tuoi = sc.nextInt();
        } while (tuoi <= 0);
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap bo phan: ");
        boPhan = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("%-10d%-20s%-10d%-10s%-10s\n", maNV, ten, tuoi, diaChi, boPhan);
    }
}
