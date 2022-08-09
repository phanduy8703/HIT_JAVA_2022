package Bai_1;

import java.util.Scanner;

public class PhongMay {

    private static Scanner sc = new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private Double dienTich;
    private May x = new May();
    private QuanLy y = new QuanLy();

    public void input() {

        System.out.print("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.print("Nhap ten phong: ");
        tenPhong = sc.nextLine();
        System.out.print("Nhap dien tich: ");
        dienTich = sc.nextDouble();
        x.input();
        y.input();

    }

    public void output() {

        System.out.println("======Thong tin phong may======" + "\nMa phong: " + maPhong + "\nTen phong: " + tenPhong + "\nDien tich: " + dienTich);
        x.output();
        y.output();

    }
}
