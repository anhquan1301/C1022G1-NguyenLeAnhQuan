package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class XauKiTu {
    public static void main(String[] args) {
        String s = "a a a c bb bbb bb bb bb cc cc";
        String arr[] = s.split(" ");
        List<Integer>list = new ArrayList<>();
        int count =1;
        for (int i = 0; i <arr.length ; i++) {
            if(i!=arr.length-1){
            if(arr[i].length()==arr[i+1].length()) {
                count++;
                list.add(count);
                System.out.println(list);
            }else {
                list.add(count);
                count=1;
            }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));

    }

}