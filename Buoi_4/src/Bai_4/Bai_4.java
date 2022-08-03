package Bai_4;

public class Bai_4 {
    public static void main(String[] args) {
        Employee nv = new Employee();
        Employee a = new Employee("289","Duy",19,15);
        a.xuat();
        a.setId("289");
        a.setName("Duy");
        a.setAge(19);
        a.setWorkingDays(15);
        System.out.println("Ma nhan vien: " + a.getId() + "\nHo ten: " + a.getName() + "\nTuoi: " + a.getAge() + "\nSo ngay di lam: " + a.getWorkingDays());
        nv.nhap();
        nv.xuat();
    }
}