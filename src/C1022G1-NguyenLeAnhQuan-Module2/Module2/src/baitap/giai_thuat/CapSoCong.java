package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapSoCong {
    public static void main(String[] args) {
        String s =  "1 3 5 7 9";
        boolean flag = false;
        String arr [] = s.split(" ");
        int arr2 [] = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        int a = arr2[1]-arr2[0];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr2.length-1 ; i++) {
            if(arr2[i+1]-arr2[i]==a){
                list.add(arr2[i]);
            }
        }
        list.add(arr2.length-1);
        if(list.size()==arr2.length){
            flag = true;
        }
        System.out.println(flag);
    }
}
