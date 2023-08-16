package baitap.giai_thuat;

import java.util.HashMap;
import java.util.Map;

public class DemSoLanXuatHienTrongMang {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "grape", "banana"};
        String[] uniqueArray = removeDuplicates(array);
        System.out.println("Mảng sau khi loại bỏ giá trị trùng lặp:");
        for (String element : uniqueArray) {
            System.out.println(element);
        }
        Map<String, Integer> wordCountMap = countOccurrences(array);
        System.out.println("Số lần xuất hiện của mỗi từ:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }
    public static String[] removeDuplicates(String[] array) {
        Map<String, Boolean> uniqueMap = new HashMap<>();
        for (String element : array) {
            uniqueMap.put(element, true);
        }
        return uniqueMap.keySet().toArray(new String[0]);
    }
    public static Map<String, Integer> countOccurrences(String[] array) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String element : array) {
            if (wordCountMap.containsKey(element)) {
                int count = wordCountMap.get(element);
                wordCountMap.put(element, count + 1);
            } else {
                wordCountMap.put(element, 1);
            }
        }
        return wordCountMap;
    }
}
