package baitap.giai_thuat;

import java.util.*;

public class abcde {
    public static void main(String[] args) {
        String s = "3 12 9 6";
        String arr[] = s.split(" ");
        int arr2[] = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
           arr2[i] += Integer.parseInt(arr[i]);
        }
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <arr2.length ; i++) {
            integerList.add(arr2[i]);
        }
        Collections.sort(integerList);
        List<Integer> i2 = new ArrayList<>();
        for (int i = integerList.get(0);i<=integerList.get(integerList.size()-1); i++) {
            i2.add(i);
        }
        for (int i = 0; i <integerList.size() ; i++) {
            for (int j = 0; j <i2.size() ; j++) {
                if(integerList.get(i)==i2.get(j)){
                    i2.remove(integerList.get(i));
                }
            }
        }
        System.out.println(i2);
    }
}
