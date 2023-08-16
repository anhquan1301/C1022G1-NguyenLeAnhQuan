package baitap.giai_thuat;

import java.util.Arrays;

public class SapXepChuoiString {
    public static void main(String[] args) {
        String str = "bnsdmavdc";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
