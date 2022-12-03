import java.util.Scanner;

public class TamGiacVuongTopLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int numb = scanner.nextInt();
        int i;
        int j;
        String result;
        for (i=1;i<=numb;i++){
            for (j=numb;j>=i;j--){
                    result = "*";
                    System.out.print(result);
                }
            System.out.println();
            }
        }
    }
