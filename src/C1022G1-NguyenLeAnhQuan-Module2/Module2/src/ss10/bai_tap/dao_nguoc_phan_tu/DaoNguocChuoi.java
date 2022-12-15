package ss10.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String>wStack = new Stack<>();
        System.out.println("Nhập chuỗi bất kì");
        String mWord = sc.nextLine();
        String arr [] = mWord.split("");
        for (int i = 0; i <arr.length ; i++) {
            wStack.push(arr[i]);
        }
        while (!wStack.empty()){
            System.out.print(wStack.pop());
        }
    }
}
