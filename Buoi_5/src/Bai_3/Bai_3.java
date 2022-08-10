package Bai_3;

public class Bai_3 {

    public static void main(String[] args) {

        System.out.println(isPrime(8));
        System.out.println(isPrime(7L));
        System.out.println(isPrime(7.0f));
        System.out.println(isPrime(25.08));

    }

    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean isPrime(long n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean isPrime(float n) {

        int x = (int) n;
        if (x != n) {
            return false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public static boolean isPrime(double n) {

        int x = (int) n;
        if (x != n) {
            return false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
