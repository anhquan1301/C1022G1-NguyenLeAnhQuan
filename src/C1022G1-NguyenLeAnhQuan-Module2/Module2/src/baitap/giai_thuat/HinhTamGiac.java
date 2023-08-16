package baitap.giai_thuat;

import java.util.Scanner;

public class HinhTamGiac {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= k; j++) {
                if (j == 1 || j == k || i == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            k += 2;
        }

    }
}
