package baitap.giai_thuat;

import java.util.Arrays;

public class DemKyTu {
    public static void main(String[] args) {
        String s = "cabcdeeb";
        String arr[] = s.split("");
        int count=1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(!arr[i].equals(arr[i+1])){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
