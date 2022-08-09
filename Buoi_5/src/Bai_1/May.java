package Bai_1;

import java.util.Scanner;

public class May {

    private static Scanner sc = new Scanner(System.in);
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void input() {

        System.out.print("Nhap ma may: ");
        maMay = sc.nextLine();
        System.out.print("Nhap kieu may: ");
        kieuMay = sc.nextLine();
        System.out.print("Nhap tinh trang: ");
        tinhTrang = sc.nextLine();

    }

    public void output() {

        System.out.println("Ma may: " + maMay + "\nKieu may: " + kieuMay + "\nTinh trang: " + tinhTrang);

    }
}
