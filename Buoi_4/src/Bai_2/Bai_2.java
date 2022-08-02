package Bai_2;

public class Bai_2 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();
        NhanVien nv3 = new NhanVien();
        NhanVien nv4 = new NhanVien();
        NhanVien nv5 = new NhanVien();
        nv1.nhap();
        nv2.nhap();
        nv3.nhap();
        nv4.nhap();
        nv5.nhap();
        System.out.println("\t\tTHONG TIN CAC NHAN VIEN");
        System.out.printf("%-10s%-20s%-10s%-10s%-10s\n", "Manv", "Tennv", "Tuoi", "DiaChi", "BoPhan");
        nv1.xuat();
        nv2.xuat();
        nv3.xuat();
        nv4.xuat();
        nv5.xuat();
    }
}
