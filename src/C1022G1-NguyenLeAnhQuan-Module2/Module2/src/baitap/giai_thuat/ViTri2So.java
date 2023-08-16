package baitap.giai_thuat;

import java.util.HashMap;
import java.util.Map;

public class ViTri2So {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int N = 12;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = N - arr[i];
            if (map.containsKey(complement)) {
                int index1 = map.get(complement);
                int index2 = i;
                System.out.println("Vị trí của hai số có tổng bằng " + N + " là: " + index1 + ", " + index2);
            }
            map.put(arr[i], i);
        }
    }

}
