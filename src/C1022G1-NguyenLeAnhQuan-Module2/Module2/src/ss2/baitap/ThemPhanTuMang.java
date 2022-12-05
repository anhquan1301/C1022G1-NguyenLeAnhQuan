package ss2.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int doDaimang = Integer.parseInt(sc.nextLine());
        int arr[] = new int[doDaimang];
        int arr2[] = new int[doDaimang + 1];
        for (int i = 0; i < doDaimang; i++) {
            System.out.print("Nhập số tại vị trí[" + i + "] ");
            int ele = Integer.parseInt(sc.nextLine());
            arr[i] = ele;
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Nhập số X cần chèn: ");
        int numb = sc.nextInt();
        System.out.print("Nhập vị trí của X cần chèn: ");
        int index = sc.nextInt();
        for (int i = 0; i < doDaimang + 1; i++) {
            if (i == index) {
                arr2[i] = numb;
            } else if (index > i) {
                arr2[i] = arr[i];
            } else {
                arr2[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }


}
