package baitap;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        return width * height;
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Diện tích hình chữ nhật: " + rectangle.area());
    }
}
