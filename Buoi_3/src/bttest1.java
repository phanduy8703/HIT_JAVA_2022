import java.util.Scanner;

public class bttest1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        System.out.println("Tong cac snt trong mang la " + tong(c, n));
        double pi = Math.PI;
    }

    public static boolean snt(int a) {
        int dem = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                dem++;
            }
        }

        if (dem == 2) {
            return true;
        } else
            return false;
    }

    public static int tong(int c[], int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (snt(c[i]) == true) {
                tong += c[i];
            }
        }
        return tong;
    }
}