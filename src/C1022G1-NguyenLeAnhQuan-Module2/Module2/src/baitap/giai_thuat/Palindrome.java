package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    public static void main(String[] args) {
        String s = "a man, a plan, a canal: Panama";
        StringBuilder a = new StringBuilder();
        String b= "False";
        for (int i = 0; i < s.length(); i++) {
            char c = s.toLowerCase().charAt(i);
            if (Character.isDigit(c) || Character.isLetter(c)) {
                a.append(c);
            }
        }
        System.out.println(s);
        if(a.toString().equals(a.reverse().toString())){
            b = "True";
        }else {
            b= "False";
        }

    }
}
