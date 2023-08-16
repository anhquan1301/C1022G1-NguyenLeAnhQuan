package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OutPut2SoCoTongBangN {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = 6;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] + arr[j] == n ){
                    System.out.println("Số thứ nhất " + arr[i] + ", Số thứ hai "+arr[j]);
                }
            }
        }
    }
}
