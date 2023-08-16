package baitap.java;

public abstract class Shape {
    private String color;
    Shape(String color) {
        this.color = color;
    }
    public abstract void draw();
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

 class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + getColor());
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + ", height " + height + ", and color " + getColor());
    }
}

 class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 10.0, 7.0);
        circle.draw();
        rectangle.draw();
    }
}