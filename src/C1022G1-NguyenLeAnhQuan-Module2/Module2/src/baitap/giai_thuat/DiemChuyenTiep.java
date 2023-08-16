package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiemChuyenTiep {
    public static void main(String[] args) {
        Integer [] a = {0,1,0,1,0,0};
        List<Integer> arr = new ArrayList<>(Arrays.asList(a));
        int n = 0;
        if(arr.get(0)!=0){
            n = 0;
        }
        if(arr.get(arr.size()-1)!=1){
            n = -1;
        }
        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i) != arr.get(i+1)){
                n=i+1;
                break;
            }
        }
        System.out.println(n);
    }
}
