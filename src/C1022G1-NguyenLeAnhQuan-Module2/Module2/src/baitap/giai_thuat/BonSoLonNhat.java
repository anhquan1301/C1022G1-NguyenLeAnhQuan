package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BonSoLonNhat {
    public static void main(String[] args) {
        int n = 1234;
        String s = String.valueOf(n);
        String[] arr = s.split("");
        List<Integer> stringList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            stringList.add(Integer.valueOf(arr[i]));
        }
        int min = stringList.get(0);
        if (stringList.size()!=4) {
            System.out.println("Nhập lại");
        } else {
            for (int i = 0; i < stringList.size(); i++) {
                if (stringList.get(i) < min) {
                    min = stringList.get(i);
                }
            }
            if (stringList.get(0) < min) {
                stringList.remove(stringList.indexOf(min));

            }if(stringList.get(0)> stringList.get(1)){


            }else {
                stringList.remove(stringList.get(0));
            }

            System.out.println(stringList);
        }
    }
}
