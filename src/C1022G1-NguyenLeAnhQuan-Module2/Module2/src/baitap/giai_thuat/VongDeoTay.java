package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VongDeoTay {
    public static void main(String[] args) {
        String bracelet = "CODEGYM";
//        String bracelet = "ZACAB";
        String result = "";
        char c = bracelet.charAt(0);
        for (int i = 0; i <bracelet.length(); i++) {
            if(bracelet.charAt(i)<c){
                c=bracelet.charAt(i);
            }
        }
        List<String> listStr = new ArrayList<>();
        if(c==bracelet.charAt(0)){
           result = bracelet;
        }else {
            for (int i = 0; i <bracelet.length(); i++) {
                boolean flag = false;
                StringBuilder stringBuilder = new StringBuilder();
                if(c==bracelet.charAt(i)){
                    int length = bracelet.length();
                    int k=0;
                    for (int j = 0; j < length; j++) {
                        if(j>=i){
                            stringBuilder.append(bracelet.charAt(j));
                        }
                        if(j==bracelet.length()-1){
                            flag=true;
                            j=0;
                            length = i;
                        }
                        if(flag){
                            stringBuilder.append(bracelet.charAt(k));
                            k++;
                        }
                        if(stringBuilder.length()==bracelet.length()){
                            listStr.add(String.valueOf(stringBuilder));
                            break;
                        }
                    }
                }
            }
            String minString = listStr.get(0);
            for (int i = 1; i < listStr.size(); i++) {
                if (listStr.get(i).compareTo(minString) < 0) {
                    minString = listStr.get(i);
                }
            }
            result = minString;
        }

        System.out.println(listStr);
        System.out.println(result);
    }
}
