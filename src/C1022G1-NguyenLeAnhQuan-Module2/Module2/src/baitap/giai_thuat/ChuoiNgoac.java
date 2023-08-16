package baitap.giai_thuat;

import java.util.*;

public class ChuoiNgoac {
    public static void main(String[] args) {
        String s = "([)]";
        String rs = "False";
        StringBuilder stringBuilder = new StringBuilder(s);
        int count=0;
        if(s.length()%2==0 && (s.charAt(0)=='(' || s.charAt(0)=='{' || s.charAt(0)=='[') ){
            for (int i = 0; i <stringBuilder.length(); i++) {
                if(stringBuilder.charAt(i)=='('){
                    for (int j = i; j < stringBuilder.length(); j++) {
                        if(stringBuilder.charAt(j)==')'){
                            count++;
                            stringBuilder.deleteCharAt(j);
                            break;
                        }
                    }
                }
                if(stringBuilder.charAt(i)=='{'){
                    for (int j = i; j < stringBuilder.length(); j++) {
                        if(stringBuilder.charAt(j)=='}'){
                            count++;
                            stringBuilder.deleteCharAt(j);
                            break;
                        }
                    }
                }
                if(stringBuilder.charAt(i)=='['){
                    for (int j = i; j < stringBuilder.length(); j++) {
                        if(stringBuilder.charAt(j)==']'){
                            count++;
                            stringBuilder.deleteCharAt(j);
                            break;
                        }
                    }
                }
            }
        }
        if(count==s.length()/2){
            rs="True";
        }
        System.out.println(rs);
    }
}