package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class trungBinhCong5 {
    public static void main(String[] args) {
        List <Integer> arr = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();
        arr.add(0);

        System.out.println(arr);
        int sum=0;
        int avg=0;
        int count=0;
        for (int i = 0; i <arr.size() ; i++) {
            sum += arr.get(i);
        }
        avg = sum/arr.size();
        for (int i = 0; i <arr.size() ; i++) {
            if(arr.get(i)<avg){
                count++;
            }
        }
        list2.add(avg);
        list2.add(count);
        System.out.println(list2);
    }
}
