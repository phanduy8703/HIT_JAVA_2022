package Bai_1;

public class b {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        System.out.println(p1);
        Point p2 = new Point(9,6);
        System.out.println(p2);
        p1.setX(6);
        p1.setY(9);
        System.out.println(p1);
        System.out.println("X is: " + p1.getX());
        System.out.println("Y is: " + p1.getY());
        p1.setXY(5, 6);
        System.out.println(p1);
        System.out.println("X is: " + p1.getXY()[0]);
        System.out.println("Y is: " + p1.getXY()[1]);
        System.out.printf("Distance is: %.2f%n", p1.distance(10, 11));
        System.out.printf("Distance is: %.2f%n", p1.distance(p2));
        System.out.printf("Distance is: %.2f%n", p2.distance(p1));
        System.out.printf("Distance is: %.2f%n", p1.distance());
    }
}
