package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemSoVong {
    public static void main(String[] args) {
//        int l= 9;
//        int r= 13;
//        int count =0;
//        int arr [] = new int[r-l+1];
//        for (int j = 0; j <arr.length ;) {
//            for (int i = l; i <=r ; i++) {
//                arr[j] = i;
//                j++;
//            }
//        }
//        String str [] = new String[arr.length];
//        for (int i = 0; i <arr.length ; i++) {
//            str[i] = String.valueOf(arr[i]);
//        }
//        List<Integer> integerList = new ArrayList<>();
//        for (int i = 0; i <str.length ;i++) {
//                if(str[i].charAt(0)==str[i].charAt(str[i].length()-1)){
//                    integerList.add(Integer.valueOf(str[i]));
//                }
//            }
//        System.out.println(integerList);
        int l = 9;
        int r =13;
        List<Integer> integerList = new ArrayList<>();
        String s = "";
        for (int i = l; i <=r ; i++) {
            s = i+"";
            if(s.charAt(0)==s.charAt(s.length()-1)){
               integerList.add(i);
            }
        }
        int arr [] = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            arr[i] = integerList.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
