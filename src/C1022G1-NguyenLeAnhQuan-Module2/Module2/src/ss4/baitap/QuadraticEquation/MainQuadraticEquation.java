package ss4.baitap.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if(quadraticEquation.getDelta()>0){
            System.out.println("Nghiệm thứ nhất: " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ hai: " + quadraticEquation.getRoot2());
        }
        else if(quadraticEquation.getDelta()==0){
            System.out.println("Nghiệm kép: " + quadraticEquation.getRoot1());
        }
        else{
            System.out.println("The equation has no roots");
        }
    }
}
