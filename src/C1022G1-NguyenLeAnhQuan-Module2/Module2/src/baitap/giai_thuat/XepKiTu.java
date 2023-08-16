package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XepKiTu {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "adbc";
        int result=0;
        List<Integer> list = new ArrayList<>();
        if(s1.length()==s2.length()){
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j <s2.length(); j++) {
                    if(s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i)){
                        list.add(1);
                    }
                }
            }
        }
        if(list.size()==s1.length()){
            result=1;
        }
//        if (s1.length() != s2.length()) {
//            result = 0; // Hai chuỗi khác độ dài, không thể đổi chỗ để trở thành nhau
//        }
//        char[] chars1 = s1.toCharArray();
//        char[] chars2 = s2.toCharArray();
//        System.out.println(chars1);
//        System.out.println(chars2);
//        Arrays.sort(chars1);
//        Arrays.sort(chars2);
//        System.out.println(chars1);
//        System.out.println(chars2);
//        result = Arrays.equals(chars1, chars2) ? 1 : 0;
//        System.out.println(list);
        System.out.println(result);
    }
}
