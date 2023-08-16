package baitap.giai_thuat;

import java.util.*;

public class PhoneNumber {
    public static void main(String[] args) {
        int n = 288;
        String m = String.valueOf(n);
        Map<Integer,String> map = new TreeMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        int j =0;
        List<String> list = new ArrayList<>();
        list.add("");
        for (int i = 0; i < m.length(); i++) {
            List<String> list1 = new ArrayList<>();
            for (String string1 : list) {
                for (char c : map.get(Integer.parseInt(String.valueOf(m.charAt(i)))).toCharArray()) {
                    list1.add(string1 + c);
                }
            }
            list = list1;
        }
        String rs = "";
        for (int i = 0; i <list.size(); i++) {
            rs += list.get(i)+" ";
        }
        System.out.println(rs);
    }
}
