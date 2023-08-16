package baitap.giai_thuat;
import java.util.Arrays;
public class SapXepChuoi {
    public static void main(String[] args) {
        String a = "emdcbaCBA";
        String[] arr = a.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
