package Bai_2;

import java.util.Scanner;

public class Bai_2 {

    public static void main(String[] args) {

        int n, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        Student[] students = new Student[n];

        do {

            System.out.println("Nhap lua chon!"
                    + "\n1. Nhập một mảng n sinh viên."
                    + "\n2. Hiển thị thông tin các sinh viên ra màn hình."
                    + "\n3. Tìm kiếm sinh viên theo Id và hiển thị ra màn hình."
                    + "\n4. Sửa các sinh viên có province là “Thanh Hóa” thành “Hải Phòng”."
                    + "\n5. Xóa sinh viên theo Id.");

            x = sc.nextInt();

            switch (x) {

                case 1:
                    for (int i = 0; i < n; i++) {

                        students[i] = new Student();
                        students[i].input();

                    }
                    break;

                case 2:
                    System.out.println("Thong tin sinh vien!");
                    for (int i = 0; i < n; i++) {

                        students[i].output();

                    }
                    break;

                case 3:
                    System.out.println("Nhap id sinh vien can tim: ");
                    sc.nextLine();
                    String idtim = sc.nextLine();
                    int a = 0;
                    for (int i = 0; i < n; i++) {

                        if (students[i].getId().equals(idtim)) {

                            students[i].output();
                            break;

                        } else
                            a += 1;

                    }
                    if (a == n)
                        System.out.println("Khong co sinh vien nay!");
                    break;

                case 4:
                    int b = 0;
                    for (int i = 0; i < n; i++) {

                        if (students[i].address.getProvince().equals("Thanh Hoa")) {

                            students[i].address.setProvince("Hai Phong");
                            students[i].output();
                            b++;

                        }

                    }

                    if (b == 0)
                        System.out.println("Khong co sinh vien Thanh Hoa nao!");
                    break;

                case 5:
                    System.out.println("Nhap id sinh vien can xoa: ");
                    sc.nextLine();
                    String idxoa = sc.nextLine();
                    for (int i = 0; i < n; i++) {

                        if (students[i].getId().equals(idxoa)) {

                            for (int j = i; j < n - 1; j++) {

                                students[j] = students[j + 1];

                            }
                            i--;
                            n--;
                            
                        }

                    }
                    for (int i = 0; i < n; i++) {

                        students[i].output();

                    }

                    break;

                default:

                    System.out.println("Khong co lua chon nay!");
            }

        } while (x != 5);
    }
}

