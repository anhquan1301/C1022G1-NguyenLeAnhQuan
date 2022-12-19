package ss12.bai_tap.thuat_toan_tim_kiem_nhi_phan;

import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanTimKiemNhiPhan {

    public static int binarySearch(int[] array, int value){
        int rigth = array.length-1;
        int left =0;
        int middle = (left+rigth)/2;
        while (left<rigth){
            if (array[middle]==value){
                return middle;
            }else if (array[middle]>value){
                return rigth = middle -1;
            }else{
                return left = middle +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng ");
        int length = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.print("Nhập phần tử vào vị trí thứ [" + i + "] ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Nhập số cần tìm trong mảng: ");
        int numb = Integer.parseInt(scanner.nextLine());
        Arrays.sort(arr);
        System.out.println("Thứ tự của số cần tìm trong mảng " + binarySearch(arr, numb));
    }
}
