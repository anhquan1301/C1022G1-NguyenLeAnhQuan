package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChuoiLap {
    public static void main(String[] args) {
        String arr[] = {"Abcd0Abcd1Abcd1"};
//        String arr[] = {"ABABAB"};
        List<String> content = new ArrayList<>(Arrays.asList(arr));
        int result=0;
        for ( String str : content ) {
            int index = 0;
            boolean flag = false;
            int rs=0;
            List<Integer> listId = new ArrayList<>();
            for (int i = 1; i < str.length(); i++) {
                if(str.charAt(0)==str.charAt(i)){
                    listId.add(i);
                    index = i;
                    for (int j = 0; j < listId.get(0) ; j++) {
                       if(str.charAt(j)==str.charAt(index)){
                           flag = true;
                           if(index < str.length()-1){
                               index++;
                           }
                       }else {
                           flag = false;
                           break;
                       }
                    }
                }
            }
            if(flag && index+1==str.length()){
                result++;
            }
        }
        System.out.println(result);
    }
}
