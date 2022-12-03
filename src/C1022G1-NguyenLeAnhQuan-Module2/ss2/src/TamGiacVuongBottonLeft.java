import java.util.Scanner;

public class TamGiacVuongBottonLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int numb1 = scanner.nextInt();
        int i;
        int j;
        String result;
        for (i=1; i<=numb1; i++){
            for (j=1;j<=i; j++){
                    result = "*";
                    System.out.print(result);
            }
            System.out.println();
        }
    }
}
