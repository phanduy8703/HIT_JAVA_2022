import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap N = ");
            n = scanner.nextInt();
        } while (n <= 0);
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = scanner.nextInt();
        }
        System.out.println("Trung binh cong cac so le o vi tri chan la: " + TinhTBC(a, n));
        ViTriMin(a, n);
        SCP(a, n);
        SNT(a, n);
        SapXep(a, n);
        System.out.print("\nMang sau khi sap xep la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //Tính trung bình cộng các số lẻ ở vị trí chẵn
    public static double TinhTBC(int a[], int n) {
        int dem = 0;
        float tong = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0 && i % 2 != 0) {
                dem++;
                tong += a[i];
            }
        }
        return tong / dem;
    }

    //Tìm vị trí các số nhỏ nhất trong mảng
    public static void ViTriMin(int a[], int n) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.print("Vi tri cac so nho nhat trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (a[i] == min)
                System.out.print((i + 1) + " ");
        }
    }

    //Kiểm tra mảng có số chính phương không? Nếu có hiển thị ra màn hình
    public static boolean KiemTraSCP(int a) {
        int b = (int) Math.sqrt(a);
        if (b * b == a) {
            return true;
        } else {
            return false;
        }
    }

    public static void SCP(int a[], int n) {
        System.out.print("\nCac so chinh phuong trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (KiemTraSCP(a[i]) == true) {
                System.out.print(a[i] + " ");
            }
        }
    }

    //Hiển thị các số nguyên tố có trong mảng lên màn hình
    public static boolean KiemTraSNT(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static void SNT(int a[], int n) {
        System.out.print("\nCac so nguyen to trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (KiemTraSNT(a[i]) == true) {
                System.out.print(a[i] + " ");
            }
        }
    }

    //Sắp xếp mảng đã nhập theo thứ tự tăng dần
    public static void SapXep(int a[], int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
    }
}
