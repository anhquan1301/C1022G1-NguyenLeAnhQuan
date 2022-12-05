package ss3.baitap;

import java.util.Scanner;

public class DemSoKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String str = sc.nextLine();
        System.out.print("Nhập ký tự cần tìm: ");
        char kyTu = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Ký tự " + kyTu + " xuất hiện " + count + " lần");
    }
}
