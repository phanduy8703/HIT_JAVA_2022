import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args)
    {
        System.out.print("Nhap vao thang sinh: ");
        Scanner sc = new Scanner(System.in);
        int thang = sc.nextInt();
        System.out.print("Nhap vao ngay sinh: ");
        int ngay = sc.nextInt();
        switch(thang) {
            case 1:
                if (ngay > 0 && ngay < 20) {
                    System.out.println("Ma Ket!");
                } else if (ngay > 19 && ngay < 32) {
                    System.out.println("Bao Binh!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 2:
                if (ngay > 0 && ngay < 19) {
                    System.out.println("Bao Binh!");
                } else if (ngay >= 19 && ngay <= 29) {
                    System.out.println("Song Ngu!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 3:
                if (ngay > 0 && ngay < 21) {
                    System.out.println("Song Ngu!");
                } else if (ngay > 20 && ngay < 32) {
                    System.out.println("Bach Duong!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 4:
                if (ngay > 0 && ngay < 21) {
                    System.out.println("Bach Duong!");
                } else if (ngay > 20 && ngay < 31) {
                    System.out.println("Kim Nguu!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 5:
                if (ngay > 0 && ngay < 21) {
                    System.out.println("Kim Nguu!");
                } else if (ngay > 20 && ngay < 32) {
                    System.out.println("Song Tu!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 6:
                if (ngay > 0 && ngay < 22) {
                    System.out.println("Song Tu!");
                } else if (ngay > 21 && ngay < 31) {
                    System.out.println("Cu Giai!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 7:
                if (ngay > 0 && ngay < 23) {
                    System.out.println("Cu Giai!");
                } else if (ngay > 22 && ngay < 32) {
                    System.out.println("Su Tu!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 8:
                if (ngay > 0 && ngay < 23) {
                    System.out.println("Su Tu!");
                } else if (ngay > 22 && ngay < 32) {
                    System.out.println("Xu Nu!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 9:
                if (ngay > 0 && ngay < 23) {
                    System.out.println("Xu Nu!");
                } else if (ngay > 22 && ngay < 31) {
                    System.out.println("Thien Binh!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 10:
                if (ngay > 0 && ngay < 24) {
                    System.out.println("Thien Binh!");
                } else if (ngay > 23 && ngay < 32) {
                    System.out.println("Bo Cap!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 11:
                if (ngay > 0 && ngay < 23) {
                    System.out.println("Bo Cap!");
                } else if (ngay > 22 && ngay < 31) {
                    System.out.println("Nhan Ma!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            case 12:
                if (ngay > 0 && ngay < 24) {
                    System.out.println("Nhan Ma!");
                } else if (ngay > 23 && ngay < 32) {
                    System.out.println("Ma Ket!");
                } else {
                    System.out.println("Ngay sinh khong hop le!");
                }
                break;
            default:
                System.out.println("Ngay sinh khong hop le!");
        }

    }
}