package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class KyTuTrungLap {
    public static void main(String[] args) {
        String s = "abcbdcef";
        List<String> list = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i+1; j <s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==2){
                list.add(String.valueOf(s.charAt(i)));
                flag=true;
            }
        }
        if(!flag){
            list.add("-1");
        }
        System.out.println(list);
    }
}
