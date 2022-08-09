package Bai_4;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    private String id, name;
    private int age, workingDays;
    private static final int PRICE = 50;

    public Employee() {

    }

    public Employee(String id, String name, int age, int workingDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWorkingDays() {
        return workingDays;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double salary() {
        return workingDays * PRICE;
    }

    public void nhap() {
        System.out.print("Nhap ma nhan vien: ");
        id = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();
        do {
            System.out.print("Nhap tuoi: ");
            age = sc.nextInt();
        } while (age <= 0);
        do {
            System.out.print("Nhap so ngay di lam: ");
            workingDays = sc.nextInt();
        } while (workingDays < 0);
    }

    public void xuat() {
        System.out.println("Ma nhan vien: " + id + "\nHo ten: " + name + "\nTuoi: " + age + "\nSo ngay di lam: " + workingDays + "\nLuong: " + salary());
    }
}