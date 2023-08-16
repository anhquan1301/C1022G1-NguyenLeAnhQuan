package baitap.giai_thuat;

import java.util.*;

public class DayConTangDonDieuDaiNhat {
    public static void main(String[] args) {
        Integer arr[] = {1,2,5,4,6,5,6,7,2,3,4,5,6,9,8};
        List<Integer> a = new ArrayList<>(Arrays.asList(arr));
//        int n = arr.length;
//        int[] lis = new int[n];
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            lis[i] = 1;
//            for (int j = 0; j < i; j++) {
//                if (a.get(i) > a.get(j) && lis[i] < lis[j] + 1) {
//                    lis[i] = lis[j] + 1;
//                }
//            }
//            max = Math.max(max, lis[i]);
//        }
//        System.out.println(max);
        int rs = 2;
        for (int i = 1; i <a.size()-1 ; i++) {
            if(a.get(i)>a.get(i-1) && a.get(i+1)>a.get(i)){
                rs++;
            }
            if(a.get(i)>a.get(i-1) && a.get(i+1)<a.get(i) && a.get(i+1)>a.get(i-1)){
                a.remove(i);
                i--;
            }
            if(a.get(i)>a.get(i-1) && a.get(i+1)<a.get(i)){
                a.remove(i+1);
                i--;
            }
        }
        System.out.println(a);
    }
}
