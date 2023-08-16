package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KiemTraTanSoXuatHienCuaPhanTu {
    public static void main(String[] args) {
        String s = "1 2 2 3 1 3 1 3 2";
        String[]arr = s.split(" ");
        List<Integer> list= new ArrayList<>();
        Arrays.sort(arr);
        boolean result = false;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i].equals(arr[i+1])){
                list.add(1);
            }
        }
        if(list.size()==arr.length){
            result=true;
        }
        System.out.println(list);
        System.out.println(result);
    }
}
