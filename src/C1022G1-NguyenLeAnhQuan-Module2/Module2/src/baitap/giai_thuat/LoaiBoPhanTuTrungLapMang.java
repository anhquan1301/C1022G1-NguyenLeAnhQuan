package baitap.giai_thuat;

import java.util.*;

public class LoaiBoPhanTuTrungLapMang {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,2,4,5,2,3,2,3};
//        List<Integer> integerList = new ArrayList<>();
//        List<Integer> integerList1 = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            integerList.add(arr[i]);
//        }
//        System.out.println(integerList);
//        for (int i = 0; i < integerList.size(); i++) {
//            for (int j = i+1; j < integerList.size(); j++) {
//                if(!integerList1.contains(integerList.get(i))){
//                        integerList1.add(integerList.get(i));
//                }
//            }
//        }
//        System.out.println(integerList1);

        int[] arr = {1,2,3,3,2,4,1,5,5,5};
        for (int i = 0; i <arr.length ; i++) {
            int count = 0;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]);
            }
        }

//        int[] newArr = new int[arr.length];
//        int index = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            boolean flag = false;
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[i]==arr[j]){
//                    flag = true;
//                    break;
//                }
//            }
//            if(!flag){
//                newArr[index] = arr[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(Arrays.copyOf(newArr,index)));


//        System.out.println(Arrays.toString(newArr));
//        int[] result = new int[index];
//        for (int i = 0; i < newArr.length; i++) {
//            if (newArr[i] != 0) {
//                result[i] = newArr[i];
//            }
//        }
//        System.out.println(Arrays.toString(result));
    }
}
