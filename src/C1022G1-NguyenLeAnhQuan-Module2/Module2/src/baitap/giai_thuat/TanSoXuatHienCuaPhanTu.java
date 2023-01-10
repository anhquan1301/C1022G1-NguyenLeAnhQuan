package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TanSoXuatHienCuaPhanTu {
    public static void main(String[] args) {
        String s = "1 2 2 3 1 3";
        String arr[] = s.split(" ");
        boolean flag = true;
        List<String> stringList =new ArrayList<>();
        List<Integer> stringList1 =new ArrayList<>();
        Collections.addAll(stringList,arr);
        int count=0;
        for (int i = 0; i <stringList.size(); i++) {
            count =0;
            for (int j=0;j<stringList.size();j++){
                if(stringList.get(i).equals(stringList.get(j))){
                    count++;
                }
            }
            stringList1.add(count);
        }
        for (int i = 0; i <stringList1.size() ; i++) {
            if(stringList1.get(i)!=stringList1.get(0)){
                flag = false;
                break;
            }else {
                flag = true;
            }
        }
        System.out.println(stringList1);
        System.out.println(flag);
    }
}
