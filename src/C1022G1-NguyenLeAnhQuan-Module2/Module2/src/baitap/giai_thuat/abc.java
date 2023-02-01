package baitap.giai_thuat;

import java.util.*;

public class abc {
//    public static void main(String[] args) {
//        String a = "congratulations";
//        String arr[] = a.split("");
//        Arrays.sort(arr);
//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i].equals(arr[i + 1])) {
//                list1.add(arr[i]);
//            }
//        }
//        for (int i = 0; i < list1.size() - 1; i++) {
//            if (!list1.get(i).equals(list1.get(i + 1))) {
//                list2.add(list1.get(i));
//            }
//        }
//        if (list2.size() != 0) {
//            list2.add(list1.get(list1.size() - 1));
//        } else if (list1.size() == 1) {
//            list2.add(list1.get(0));
//        }
//        char arr2[] = new char[list2.size()];
//        for (int i = 0; i < list2.size(); i++) {
//            arr2[i] = list2.get(i).toCharArray()[0];
//        }
//        System.out.println(arr2);
//    }
//}
//        String arr2[] = new String[arr.length-list.size()];
//        int count =0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <list.size() ; j++) {
//                if(arr[i].equals(list.get(j))){
//                    arr2[count] = arr[i];
//                    count++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr2));
//       String arr[] = a.split("");
//       Set<String> set = new HashSet<>();
//       List<String> list = new ArrayList<>();
//        Collections.addAll(set,arr);
//        Collections.addAll(list,arr);
//        System.out.println(set);
//        System.out.println(list);
//        String arr2[] = new String[set.size()];
//        String arr3[] = new String[list.size()-arr2.length];
//        Collections.addAll(set,arr2);
//        System.out.println(Arrays.toString(arr2));
//        int count = 0;
//        int count1 = 0;
//        for (int i = 0; i <arr2.length ; i++) {
//            for (int j = 0; j <list.size() ; j++) {
//                if(list.get(j).equals(arr2[i])){
//                    count++;
//                }
//            }
//            if(count>1){
//                arr3[count1] = arr2[i];
//                count1++;
//            }
//        }
//        System.out.println(Arrays.toString(arr3));
//        char arr3 []=new char[count];
//        for (int i = 0; i <arr2.length ; i++) {
//             arr3[i] = arr2[i].toCharArray()[0];
//        }
//        System.out.println(arr3);
//    }
//}
    public static void main(String[] args) {
        String arg1="abdcef";
        char[] arr = new char[arg1.length()];
        int count = 0;

        for (int i = 0; i < arg1.length(); i++) {
            char currentChar = arg1.charAt(i);
            int charCount = 0;
            for (int j = i + 1; j < arg1.length(); j++) {
                if (currentChar == arg1.charAt(j)) {
                charCount++;
                }
            }
            if (charCount > 0) {
            arr[count] = currentChar;
            count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//

