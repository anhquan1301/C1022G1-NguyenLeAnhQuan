package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class TimKyTuChung2Chuoi {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
        String s3 = "";
        for(int i=0;i<s1.length();i++){
            for (int j=0; j <s2.length();j++) {
                if(s1.charAt(i)==s2.charAt(j)) {
                    s3 += s1.charAt(i);
                    if(j!=s2.length()-1) {i++;}
                }
            }
        }
        System.out.println(s3.length());

    }
}
