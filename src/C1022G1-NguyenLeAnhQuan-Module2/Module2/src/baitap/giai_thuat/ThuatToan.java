package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThuatToan {
    public static void main(String[] args) {
        String s = "555";
        String[] arr =  s.split(" ");
        int arr2 [] = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        int max=arr2[0];
        for (int i = 0; i <arr2.length ; i++) {
            if(max<arr2[i]){
                max = arr2[i];
            }
        }
        int count=0;
        for (int i = 0; i <arr2.length ; i++) {
            if (arr2[i] == max) {
                count++;
            }
        }
        int arr3[] = new int[arr2.length-count];
        int count1 = 0;
        for (int i = 0; i <arr2.length ; i++) {
            if(arr2[i]!=max){
                arr3[count1]=arr2[i];
                count1++;
            }
        }
        int max2 = 0;
        for (int i = 0; i <arr3.length ; i++) {
            if(max2<arr3[i]){
                max2=arr3[i];
            }
        }
        int index=0;
        for (int i = 0; i <arr2.length ; i++) {
            if(max2==arr2[i]){
                index = i;
                break;
            }
            if(arr3.length==0){
                index = -1;
            }
        }
        System.out.println(index);
}
}
