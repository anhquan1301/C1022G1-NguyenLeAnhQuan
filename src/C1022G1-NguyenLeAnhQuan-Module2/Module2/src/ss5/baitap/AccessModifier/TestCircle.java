package ss5.baitap.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10.5, "Blue");
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColor());
        System.out.println(circle1.getArea());
        Circle circle2 = new Circle(5.5, "Yellow");
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getColor());
        System.out.println(circle2.getArea());
    }
}
