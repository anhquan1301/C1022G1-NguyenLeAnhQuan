package baitap.giai_thuat;

import java.util.Arrays;

public class DemSoVong {
    public static void main(String[] args) {
//        int l= 5;
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
//        System.out.println(Arrays.toString(str));
//        for (int i = 0; i <str.length ;i++) {
//                if(str[i].charAt(0)==str[i].charAt(str[i].length()-1)){
//                    count++;
//                }
//            }
//        System.out.println(count);
        int l = 5;
        int r =25;
        int count=0;
        String s = "";
        for (int i = l; i <=r ; i++) {
            s = i+"";
            if(s.charAt(0)==s.charAt(s.length()-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
