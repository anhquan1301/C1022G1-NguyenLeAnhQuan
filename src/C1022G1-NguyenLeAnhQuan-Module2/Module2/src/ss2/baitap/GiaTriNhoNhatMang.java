package ss2.baitap;

import java.util.Scanner;

public class GiaTriNhoNhatMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int length = Integer.parseInt(sc.nextLine());
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập các phần tử vào vị trí[" + i + "] ");
            int ele = Integer.parseInt(sc.nextLine());
            arr[i] = ele;
        }
        int min = arr[0];
        for (int j = 0; j < length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.print("Giá trị bé nhất trong mảng: " + min);
    }
}
