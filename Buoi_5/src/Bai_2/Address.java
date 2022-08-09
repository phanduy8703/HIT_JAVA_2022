package Bai_2;

import java.util.Scanner;

public class Address {

    private static Scanner sc = new Scanner(System.in);
    private int id;
    private String district;
    private String province;

    public void input() {

        System.out.println("Nhap so nha: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap quan: ");
        district = sc.nextLine();
        System.out.println("Nhap tinh: ");
        province = sc.nextLine();

    }

    public void output() {

        System.out.println(" So nha: " + id);
        System.out.println(" Quan/Huyen: " + district);
        System.out.println(" Tinh/Thanh pho: " + province);

    }

    public String getProvince() {

        return province;

    }

    public void setProvince(String province) {
        this.province = province;
    }
}
