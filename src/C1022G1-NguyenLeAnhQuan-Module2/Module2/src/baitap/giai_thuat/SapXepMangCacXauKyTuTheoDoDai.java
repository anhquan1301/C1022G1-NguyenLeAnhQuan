package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SapXepMangCacXauKyTuTheoDoDai {
    public static void main(String[] args) {
        String s = "abc b aaa a zz";
        String arr [] = s.split(" ");
        String a = "";
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length-1 ; j++) {
                if(arr[j].length()>arr[j+1].length()){
                    String temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            a += arr[i]+" ";
        }
        System.out.println(a);
    }
}
