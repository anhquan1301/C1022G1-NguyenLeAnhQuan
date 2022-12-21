package ss14.bai_tap.su_dung_try_catch_xu_li_ngoai_le;

import sun.plugin2.message.Message;

import java.util.Scanner;

public class Triangle  {
    public static void inputTriangle(double a, double b, double c) throws IllegalTriangleException{
        double ab = a+b;
        double bc = b+c;
        double ca = c+a;


        if(a<0 || b<0 || c<0 || ab<=c || bc<=a || ca<=b){
            throw new IllegalTriangleException("Không phải cạnh tam giác");
        }else {
            System.out.println("Là cạnh của tam giác");
        }

    }
    public static void main(String[] args) {
        boolean check;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập cạnh tam giác thứ nhất: ");
            double a = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập cạnh tam giác thứ hai: ");
            double b = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập cạnh tam giác thứ ba: ");
            double c = Integer.parseInt(sc.nextLine());
            try {
                inputTriangle(a, b, c);
                check = true;
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
                check = false;
            }finally {
                System.out.println("---------------------------");
            }
        }while (check == false);

    }
}
