package ss10.bai_tap.thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiThapPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int numb = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        while (numb>0){
            st.push(numb%2);
            numb = numb/2;
        }
        while (!st.empty()){
            System.out.print(st.pop());
        }
    }
}
