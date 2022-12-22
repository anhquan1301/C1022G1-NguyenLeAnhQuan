package baitap;

import java.util.Stack;

public class GiaiThuatChuoi {
    public static void main(String[] args) {
//        String a = "CodegymDaNang";
//        String str = "";
//        String str1;
//        for (int i = 0; i < a.length()-1; i++) {
//            str += a.charAt(i);
//            System.out.println(str);
//            str1 = a.charAt(i+1)+"";
//            System.out.println(str1);
//            if (str1.equals(str1.toUpperCase())) {
//                str += " ";
//            }
//        }
//        System.out.println(str.toLowerCase() + a.charAt(a.length() - 1));
        String b = "CodegymDaNang";
        String str = "";
        for (int i = b.length()-1; i >=0 ; i--) {
            str += b.charAt(i);
            for (int j = b.length()-1; j>0 ; j--) {
                if (b.charAt(i)==b.toUpperCase().charAt(j)){
                  str += " ";
                  break;
                }
            }
        }
        System.out.println(str);
        String str2 = "";
        String [] str1 = str.split("");
        Stack <String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        for (int i = 0; i < str1.length ; i++) {
            stack.push(str1[i]);
        }
        while (!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        for (int i = 0; i <stack1.size() ; i++) {
            str2 += stack1.get(i);
        }
        System.out.println(str2.toLowerCase());
//        String str = "CodeGym";
//        String str2 = str.toLowerCase();
//        String str3 = "";
//        for (int i = 1; i <str2.length() ; i++) {
//            if(str.charAt(i)!=str2.charAt(i)){
//                str3 += " " + str2.charAt(i);
//                System.out.println(str3);
//            }else {
//                str3 += str2.charAt(i);
//            }
//        }
//        System.out.println(str2.charAt(0)+str3);
    }
}