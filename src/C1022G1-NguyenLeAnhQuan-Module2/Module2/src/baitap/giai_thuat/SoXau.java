package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class SoXau {
    public static void main(String[] args) {
        int n = 1;
        String flag = "False";
        while (n%5==0){
            n = n/5;
        }
        while (n%3==0){
            n=n/3;
        }
        while (n%2==0){
            n=n/2;
        }
        if(n==1){
            flag = "True";
        }
        System.out.println(flag);
    }

}
