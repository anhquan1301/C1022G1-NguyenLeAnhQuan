package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class MoKhoa {
    public static void main(String[] args) {
        String a = "82195";
        String b = "64720";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <a.length(); i++) {
            if(a.charAt(i)<b.charAt(i)){
                list.add(b.charAt(i)-a.charAt(i));
                list.add((a.charAt(i)+10)-b.charAt(i));
            }
            if(b.charAt(i)<a.charAt(i)){
                list.add(a.charAt(i)-b.charAt(i));
                list.add((b.charAt(i)+10)-a.charAt(i));
            }
        }
        System.out.println(list);
        int sum=0;
        for (int i = 0; i <list.size()-1; i++) {
            if(list.get(i)<list.get(i+1)){
                list.remove(list.get(i+1));
                sum+=list.get(i);
                continue;
            }
            if(list.get(i)>list.get(i+1)){
                list.remove(list.get(i));
                sum+=list.get(i);
                continue;
            }
            if(list.get(i).equals(list.get(i+1))){
                list.remove(list.get(i));
               sum+=list.get(i);
            }
        }
        System.out.println(list);
        System.out.println(sum);
    }
}
