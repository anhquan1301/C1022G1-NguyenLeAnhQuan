package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class PhanTuSoLe {
    public static void main(String[] args) {
        String s = "42343534 12312312 6235345 54342321321";
        String[] arr = s.split(" ");
        List<String>arr2 = new ArrayList<>();
        List<Integer>arr3 = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            arr2.add(arr[i]);
            for (int j = 0; j <arr2.get(i).length(); j++) {
               if(Integer.parseInt(String.valueOf(arr2.get(i).charAt(0)))%2!=0){
                   arr3.add((int) Long.parseLong(arr2.get(i)));
                   break;
               }
            }
        }
        if(arr3.size()==0){
            arr3.add(-1);
        }
        System.out.println(arr3);
    }
}
