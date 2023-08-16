package baitap.giai_thuat;

import java.util.HashMap;
import java.util.Map;

public class LaMaToSoNguyen {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = map.get(s.charAt(i));
            if (i + 1 < s.length() && map.get(s.charAt(i + 1)) > num) {
                result -= num;
            } else {
                result += num;
            }
        }

        System.out.println("Kết quả chuyển đổi: " + result);
    }
}