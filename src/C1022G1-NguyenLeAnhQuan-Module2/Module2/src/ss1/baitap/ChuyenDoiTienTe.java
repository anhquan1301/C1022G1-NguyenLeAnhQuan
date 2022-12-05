package ss1.baitap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cần đổi: ");
        double numb = Double.parseDouble(scanner.nextLine());
        double vnd = 24000;
        double result = numb * vnd;
        System.out.println("Số tiền là "+result+" VND");
    }
}