package baitap.giai_thuat;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("b", 3);
        hashMap.put("c", 1);
        hashMap.put("a", 2);
        hashMap.put("d", 4);

        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("c", 3);
        linkedHashMap.put("a", 1);
        linkedHashMap.put("b", 2);
        linkedHashMap.put("d", 4);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("c", 3);
        treeMap.put("a", 1);
        treeMap.put("b", 2);
        treeMap.put("d", 4);
        System.out.println("TreeMap: " + treeMap);
    }
}