package baitap.giai_thuat;

import java.util.Arrays;

public class DoDaiNums {
    public static void main(String[] args) {
//        int[] nums = {0,1,2,3,4};
//        int n=0;
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i]-nums[i-1]!=1) {
//                n = nums[i] - 1;
//                break;
//            }else {
//               n = nums[nums.length-1]+1;
//            }
//        }
//        if(nums[0]!=0){
//            n=0;
//        }
//        if(nums[0]==0&&nums.length==1){
//            n=1;
//        }
//        System.out.println(n);
        int []n = {0,1};
        Arrays.sort(n);
        int a=0;
        for (int i = 0; i <n.length ; i++) {
            if(n[i]!=i){
                a=i;
                break;
            }else {
                a = n[n.length-1]+1;
            }
        }
        if(n[0]==0&&n.length==1){
            a=1;
        }
        System.out.println(a);
    }
}
