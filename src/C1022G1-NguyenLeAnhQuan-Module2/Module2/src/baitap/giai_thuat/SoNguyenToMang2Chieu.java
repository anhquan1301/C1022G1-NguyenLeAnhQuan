package baitap.giai_thuat;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SoNguyenToMang2Chieu {
    public static void main(String[] args) {
        int [][] a = {{1,2,8,43},{9,4,11,7},{11,6,4,0},{1,2,6,51}};
        Set<Integer> s = new TreeSet<>();
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                int count = 0;
                for (int k = 1; k <=a[i][j] ; k++) {
                    if(a[i][j]%k==0){
                        count++;
                    }
                }
                if(count==2){
                    s.add(a[i][j]);
                }
            }
        }
        int [] b = new int[s.size()];
        int i = 0;
        for (int c : s ) {
            b[i++] = c;
        }
        System.out.println(Arrays.toString(b));
    }
}
