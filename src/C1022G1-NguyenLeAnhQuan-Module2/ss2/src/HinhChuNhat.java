import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner chieuDai = new Scanner(System.in);
        System.out.println("Nhập chiều dài ");
        int numb1 = chieuDai.nextInt();
        Scanner chieuRong = new Scanner(System.in);
        System.out.println("Nhập chiều rộng ");
        int numb2 = chieuRong.nextInt();
        int i;
        int j;
        for (i = 1; i <= numb1; i++) {
            for (j=1;j<=numb2;j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}