package baitap.java;

public interface Drawable {
    default void draw() {
        System.out.println();
    };
}

 class CircleClass implements Drawable {
    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn");
    }
}

 class RectangleClass implements Drawable {
    @Override
    public void draw() {
        System.out.println("Vẽ hình chữ nhật");
    }
}

 class Demo {
    public static void main(String[] args) {
        Drawable circle = new CircleClass();
        Drawable rectangle = new RectangleClass();
        System.out.print(26);
        circle.draw();
        System.out.print(28);
        rectangle.draw();
    }
}