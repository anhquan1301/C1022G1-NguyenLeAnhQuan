package ss10.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Độ dài mảng ");
        int numb = Integer.parseInt(sc.nextLine());
        int arr[] = new int[numb];
        Stack <Integer> st1 = new Stack<>();
        for (int i=0; i <numb; i++){
            System.out.print("Nhập các phần tử vào mảng [" + i + "] ");
            arr[i] = Integer.parseInt(sc.nextLine());
            st1.push(arr[i]);
        }
        while (!st1.empty()){
            System.out.println(st1.pop());
        }
    }
}
