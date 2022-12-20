package ss13.bai_tap;

import java.util.Arrays;

public class MinhHoaThuatToanSapXepChon {
    public static void main(String[] args) {
        int arr [] = {5,3,4,1,2};
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i]; //Cho biến tạm bằng giá trị ban đầu của i, tại i=1 thì temp = 3
            System.out.println("Array " + Arrays.toString(arr) + " temp = " + temp);
            int j = i;
            for (; j >0 && temp < arr[j-1]; j--) {
                arr[j] = arr[j-1]; // Thỏa mãn điều kiện thì sẽ đổi chỗ, mảng hiện tại ở i = 1 là [5,5,4,1,2]
                System.out.println("Array " + Arrays.toString(arr) + " temp = " + temp);
            }
            arr[j] = temp; //Tại i = 1 thì arr[0] = 3, mảng hiện tại [3,5,4,1,2]
            System.out.println("Array " + Arrays.toString(arr) + " temp = " + temp);
        } // Lặp cho đến khi hết độ dài mảng
        System.out.println(Arrays.toString(arr));
    }
}
