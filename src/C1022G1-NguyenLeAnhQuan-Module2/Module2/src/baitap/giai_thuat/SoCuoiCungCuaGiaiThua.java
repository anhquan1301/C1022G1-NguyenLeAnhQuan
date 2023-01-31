package baitap.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class SoCuoiCungCuaGiaiThua {
    public static void main(String[] args) {
        int n = 12;
        int a=1;
        for (int i = 1; i <=n ; i++) {
            a = a * i;
        }
        System.out.println(a);
        String b = String.valueOf(a);
       List<String> list = new ArrayList<>();
        for (int i = 0; i <b.length(); i++) {
            list.add(b.charAt(i)+"");
        }
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals("0")){
                list.remove(list.get(i));
                i--;
                System.out.println(list);
            }
        }
        System.out.println(list);
        int c = Integer.parseInt(list.get(list.size()-1));
        System.out.println(c);
    }
}
