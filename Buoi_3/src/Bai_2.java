import java.util.Locale;
import java.util.Scanner;


public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu: ");
        String s = scanner.nextLine();
        System.out.println("Chuoi vua nhap la: " + s);
        s = xoaKhoangTrang(s);
        s = chuHoaThuong(s);
        s = xoaSo(s);
        System.out.println("Chuoi sau khi chuan hoa la: " + s);
    }

    public static String xoaKhoangTrang(String s) {
        return s.trim().replaceAll("\\s+", " ");
    }

    public static String chuHoaThuong(String s) {
        s = s.toLowerCase();
        String s1[] = s.split(" ");
        s = "";
        for (int i = 0; i < s1.length; i++) {

            s += s1[i].substring(0, 1).toUpperCase() + s1[i].substring(1);
            if (i < s1.length - 1) {
                s += " ";
            }
        }
        return s;
    }

    public static String xoaSo(String s) {
        return s.replaceAll("[0-9]", "");
    }

}

