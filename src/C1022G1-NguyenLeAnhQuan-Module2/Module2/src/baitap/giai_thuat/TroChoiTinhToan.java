package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class TroChoiTinhToan {
    public static void main(String[] args) {
        int k = 2;
        int n = 4;
        int sum = 0;
        int result = 0;
        List<Integer> list = new ArrayList<>();
        int j = 1;
        for (int i = 1; i <=n ; i++) {
            list.add(i);
        }
        while (j <= k) {
            List<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list1.add((int) Math.pow(list.get(i),2));
            }
            list=list1;
            j++;
        }
        for (int i = 0; i <list.size() ; i++) {
            sum += list.get(i);
        }
        result = sum % 10;
        System.out.println(result);
    }
}
