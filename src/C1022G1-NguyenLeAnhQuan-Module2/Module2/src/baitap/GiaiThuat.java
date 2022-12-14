package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class GiaiThuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int arrLength = Integer.parseInt(sc.nextLine());
        int arr [] = new int[arrLength];
        for (int i = 0; i < arrLength ; i++) {
            System.out.print("Nhập số phần tử [" + i + "] ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i <arrLength ; i++) {



            }
        System.out.println(Arrays.toString(arr));
    }
}
