package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapSoCong {
    public static void main(String[] args) {
        Integer[] arr = {1,3,5,6};
        int rs = 0;
        List<Integer> numbers = new ArrayList<>(Arrays.asList(arr));
        int a = numbers.get(1)-numbers.get(0);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <numbers.size()-1 ; i++) {
            if(numbers.get(i+1)-numbers.get(i)==a){
                list.add(numbers.get(i));
            }
        }
        list.add(numbers.size()-1);
        if(list.size()==numbers.size()){
            rs = 1;
        }
        System.out.println(rs);
    }
}
