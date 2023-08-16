package baitap.giai_thuat;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Nhập số bất kì");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0) {
                count++;
            }
        }
        if(count==2){
            System.out.println( "Số " +num + " là số nguyên tố");
        }else {
            System.out.println("Số " +num+ " không phải là số nguyên tố");
        }
    }
}
