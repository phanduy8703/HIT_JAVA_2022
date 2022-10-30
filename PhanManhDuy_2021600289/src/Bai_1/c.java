package Bai_1;

public class c {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(6, 6, 9.9);
        System.out.println(c2);
        Circle c3 = new Circle(new Point(9, 9), 6.6);
        System.out.println(c3);
        c1.setCenter(new Point(11, 12));
        c1.setRadius(33.3);
        System.out.println(c1);
        System.out.println("center is: " + c1.getCenter());
        System.out.println("radius is: " + c1.getRadius());
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
        System.out.printf("distance is: %.2f%n", c1.distance(c2));
        System.out.printf("distance is: %.2f%n", c2.distance(c1));
    }
}
