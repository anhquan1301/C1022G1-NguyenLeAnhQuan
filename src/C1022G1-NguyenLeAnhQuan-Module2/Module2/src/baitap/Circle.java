package baitap;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5.5);
        System.out.println("Diện tích hình tròn: " + circle.area());
    }
}
