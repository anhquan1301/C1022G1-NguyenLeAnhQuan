package ss2.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class PhanTuLonNhatMang2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột: ");
        int col = Integer.parseInt(sc.nextLine());
        int arr2D[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử tại vị trí: [" + i + "][" + j + "] ");
                int ele = Integer.parseInt(sc.nextLine());
                arr2D[i][j] = ele;
            }
        }
        int max = arr2D[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr2D[i][j] > max) {
                    max = arr2D[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng 2D: " + max);
    }
}
