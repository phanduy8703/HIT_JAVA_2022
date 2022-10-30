package Bai_2;

import java.util.Scanner;

public class Student {

    private static Scanner sc = new Scanner(System.in);
    private String id;
    private String name;
    private int age;
    Address address = new Address();

    public void input() {

        System.out.println("Nhap id sinh vien: ");
        id = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        address.input();
        sc.nextLine();

    }

    public void output() {

        System.out.println(" ID: " + id);
        System.out.println(" Ho ten: " + name);
        System.out.println(" Tuoi: " + age);
        address.output();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
