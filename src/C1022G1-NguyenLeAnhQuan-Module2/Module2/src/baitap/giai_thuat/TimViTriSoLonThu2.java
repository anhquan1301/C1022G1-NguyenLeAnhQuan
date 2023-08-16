package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimViTriSoLonThu2 {
    public static void main(String[] args) {
        Integer [] a = {8,3,6,1,5,4};
        List<Integer> list = new ArrayList<>(Arrays.asList(a));
        List<Integer> list1 = new ArrayList<>(list);
        Collections.sort(list);
        int rs = 0;
        int index=0;
        if(list.get(0)==list.get(list.size()-1)){
            index=-1;
        }else {
            for (int i = list.size()-1; i >=0; i--) {
                if(list.get(i)!=list.get(list.size()-1)){
                    rs =list.get(i);
                    break;
                }
            }
            for (int i = 0; i < list1.size(); i++) {
                if(rs==list1.get(i)){
                    index=i;
                    break;
                }
            }
        }

        System.out.println(index);
    }
}
