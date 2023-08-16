package baitap.java;

public class LambdaInJava8 {
    public static void main(String[] args) {
        // Khai báo một biến kiểu Functional Interface
        MyFunctionalInterface myFunction = (x, y) -> x + y;

        // Gọi phương thức của Functional Interface
        int result = myFunction.calculate(5, 3);

        System.out.println("Result: " + result);
    }
}


interface MyFunctionalInterface {
    int calculate(int x, int y);
}