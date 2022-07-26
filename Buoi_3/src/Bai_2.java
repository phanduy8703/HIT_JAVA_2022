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
//            s += String.valueOf(s1[i].charAt(0)).toUpperCase() + s1[i].substring(1);
            s+=s1[i].substring(0,1).toUpperCase()+s1[i].substring(1);
            if (i < s1.length - 1) {
                s += " ";
            }
        }
        return s;
    }
    public static String xoaSo(String s)
    {
        return s.replaceAll("[0-9]","");
    }
//    public static boolean kiemTraSo(char a) {
//        if ((int) a >= 48 && (int) a <= 57)
//            return true;
//        else
//            return false;
//    }
//
//    public static String xoaKyTu(String s, int a) {
//        return s.substring(0, a) + s.substring(a + 1);
//    }
//
//    public static String xoaSo(String s) {
//
//        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            if (kiemTraSo(s.charAt(i)) == true) {
//                s = xoaKyTu(s, i);
//                i--;
//                n--;
//            }
//        }
//        return s;
//    }
}

