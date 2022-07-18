import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args)
    {
        System.out.println("Nhap vao so nguyen N: ");
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }

        System.out.println("Tong cac uoc cua " + n + " la: " + tong);
    }
}
