package ss13.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanSapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int lengthArr = Integer.parseInt(sc.nextLine());
        int arr [] = new int[lengthArr];
        for (int i = 0; i <lengthArr ; i++) {
            System.out.println("Nhập phần tử vào vị trí thứ [" + i + "]");
            arr[i]=Integer.parseInt(sc.nextLine());
        }
            insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int [] list){
        for (int i = 1; i <list.length ; i++) {
            int temp = list[i];
            int j = i;
            for (; j>0 && temp<list[j-1]; j--) {
                list[j] = list[j-1];
            }
            list[j]=temp;
        }
    }
}
