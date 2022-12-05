package ss3.baitap;

import java.util.Scanner;

public class TinhTongDuongCheoMang2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của dòng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập độ dài của cột: ");
        int col = Integer.parseInt(sc.nextLine());
        int arr2D[][] = new int[row][col];
        int sum = 0;
        if (row != col) {
            System.out.println("Không phải ma trận vuông");
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("Nhập các phần tử vào vị trí [" + i + "]" + "[" + j + "] ");
                    arr2D[i][j] = Integer.parseInt(sc.nextLine());
                    if (i == j) {
                        sum += arr2D[i][j];
                    }
                }
            }
        }
        System.out.println("Tổng đường chéo chính trong ma trận vuông: " + sum);
    }
}
