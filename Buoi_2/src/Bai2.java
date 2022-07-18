import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args)
    {
        System.out.println("Nhap vao 3 canh cua tam giac:");
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        if(a+b-c<=0||b+c-a<=0||c+a-b<=0)
        {
            System.out.println("3 canh tren khong the tao thanh mot tam giac!");
        }
        else
        {
            System.out.print("Day la 3 canh cua mot tam giac ");
            if(a==b)
            {
                if (a==c)
                {
                    System.out.print("Deu!");
                }
                else if (a*a+b*b==c*c||b*b+c*c==a*a||c*c+a*a==b*b)
                {
                    System.out.print("Vuong Can!");
                }
                else
                {
                    System.out.println("Can!");
                }
            }
            else if (a*a+b*b==c*c||b*b+c*c==a*a||c*c+a*a==b*b)
            {
                System.out.println("Vuong!");
            }
            else
            {
                System.out.println("Thuong!");
            }
        }
    }
}
