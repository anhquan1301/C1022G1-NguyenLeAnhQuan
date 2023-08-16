package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class XayMangPrefix {
    public static void main(String[] args) {
        String s = "1 2 3 4 0";
        List<Integer> list = new ArrayList<>();
        for ( String a : s.split(" ") ) {
            list.add(Integer.parseInt(a));
        }
        List<Integer> list1 = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i <list.size(); i++) {
            sum+=list.get(i);
            list1.add(sum);
        }
        System.out.println(list1);
    }
}
