//package baitap.giai_thuat;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class chatAi {
//    public static char[] findChar(String str) {
//        if (str == null || str.length() == 0) {
//            return new char[0];
//        }
//
//        Map<Character, Integer> countMap = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (countMap.containsKey(c)) {
//                countMap.put(c, countMap.get(c) + 1);
//            } else {
//                countMap.put(c, 1);
//            }
//        }
//
//        List<Character> res = new ArrayList<>();
//        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
//            if (entry.getValue() > 1) {
//                res.add(entry.getKey());
//            }
//        }
//
//
//    }
//    public static void main(String[] args) {
//        String a = "abbbcdde";
//        System.out.println(findChar(a));
//    }
//}
