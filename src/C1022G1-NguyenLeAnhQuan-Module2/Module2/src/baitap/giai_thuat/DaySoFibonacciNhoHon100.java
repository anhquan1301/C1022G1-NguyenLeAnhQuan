package baitap.giai_thuat;

public class DaySoFibonacciNhoHon100 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = 0;
        System.out.println("Dãy số Fibonacci nhỏ hơn 100");
        while ( (c = a + b) < 100) {
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
