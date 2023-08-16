package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SonHangRao {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(9);
        List<Integer> c = new ArrayList<>();
        c.add(9);
        c.add(12);
        int m = 12;
        int n = 2;
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        System.out.println(arr);
//        String result = "YES";
//        int count =0;
//        Set<Integer> set = new TreeSet<>();
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.get(i).size(); j++) {
//                set.add(arr.get(i).get(j));
//                count++;
//            }
//        }
//        List<Integer> list = new ArrayList<>(set);
//        int l = m/(count/2);
//        for (int i = 0; i < list.size()-1 ; i++) {
//            if(list.get(i+1)-list.get(i)!=l){
//                result = "NO";
//            }
//        }
//        if(list.get(list.size()-1)!=m){
//            result = "NO";
//        }
//        int l = m/n;
        String result = "YES";
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                set.add(arr.get(i).get(j));
            }
        }
        List<Integer> list = new ArrayList<>(set);
        int num = 0;
        for (int i = 0; i < list.size()-1 ; i++) {
            num += list.get(i+1)-list.get(i);
        }
        if(num!=m){
            result = "NO";
        }
        if(set.size()!=arr.size()+1){
            result="NO";
        }
        System.out.println(num);
        System.out.println(set);
        System.out.println(result);
    }
}
