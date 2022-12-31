package baitap.giai_thuat;

import java.util.Arrays;

public class abc {
    public static void main(String[] args) {
       String a = "abcbcdef";
        int count=0;
        for(int i =0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }
            }
        }
        int count1=0;
       String arr [] = a.split("");
        String arr2 [] = new String[count];
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    arr2[count1] = arr[i];
                    count1++;
                }
            }
        }
        char arr3 []=new char[count];
        for (int i = 0; i <arr2.length ; i++) {
             arr3[i] = arr2[i].toCharArray()[0];
        }
        System.out.println(arr3);
    }

}
//    public static void main(String[] args) {
//        String arg1="abcbcde";
//        char[] arr = new char[arg1.length()];
//        int count = 0;
//
//        for (int i = 0; i < arg1.length(); i++) {
//            char currentChar = arg1.charAt(i);
//            int charCount = 0;
//            for (int j = i + 1; j < arg1.length(); j++) {
//                if (currentChar == arg1.charAt(j)) {
//                charCount++;
//                }
//            }
//            if (charCount > 0) {
//            arr[count] = currentChar;
//            count++;
//            }
//        }
//        System.out.println(arr);
//    }
//}


