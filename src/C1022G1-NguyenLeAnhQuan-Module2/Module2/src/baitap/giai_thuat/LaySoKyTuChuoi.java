package baitap.giai_thuat;

import java.util.HashMap;
import java.util.Map;

public class LaySoKyTuChuoi {
    public static void main(String[] args) {
        String str = "CodeGymDaNang";
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println("Số lần xuất hiện của ký tự " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
