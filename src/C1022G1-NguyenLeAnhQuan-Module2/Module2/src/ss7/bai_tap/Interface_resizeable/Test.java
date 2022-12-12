package ss7.bai_tap.Interface_resizeable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Shape shape[] = new Shape[3];
        shape[0] = new Circle(15.5);
        shape[1] = new Rectangle(10,5);
        shape[2] = new Square(20.2);



        System.out.println("Mảng các hình: " + Arrays.toString(shape));

        System.out.println("Diện tích trước khi tăng kích thước");

        shape[0].resize(0);
        shape[1].resize(0);
        shape[2].resize(0);

        System.out.println("Diện tích sau khi tăng kích thước");

        shape[0].resize(Math.random()*100+1);
        shape[1].resize(Math.random()*100+1);
        shape[2].resize(Math.random()*100+1);

    }
}
