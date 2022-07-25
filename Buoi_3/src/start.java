import java.util.Scanner;

public class start {
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
//        int []a = {1, 2, 3, 4};
//        int b[];
//        int n;
        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        int c[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            c[i] = scanner.nextInt();
//        }
//        for (int i=0; i<n; i++)
//        {
//            System.out.print(c[i] + " ");
//        }
//        for (int i : c) {
//            System.out.print(i + " ");
//        }
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(sum(a,b));
    }
}