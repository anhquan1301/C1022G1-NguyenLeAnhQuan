package baitap.giai_thuat;

import java.util.*;

public class soNguyenToMang2D {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3,11},
                {2, 3, 4,2},
                {3, 4, 5,13}
        };
        System.out.println(arr.length);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                int count = 0;
                for (int j = 1; j <= arr[i][k]; j++) {
                    if (arr[i][k] % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    set.add(arr[i][k]);
                }
            }
        }
        int arr2[] = new int[set.size()];
        int i = 0;
        for (int a : set){
            arr2[i++] = a;
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}