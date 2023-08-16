package baitap.giai_thuat;

public class ThemDauCachVaoKyTu {
    public static void main(String[] args) {
        String s = "CodegymDaNang";
        String b = s.toLowerCase();
        String c = "";
        for (int i = 0; i <s.length(); i++) {
           if(s.charAt(i) == b.charAt(i)){
             s += b.charAt(i);
           }else {
               s += " " + b.charAt(i);
           }
        }
        System.out.println(s.trim());
    }
}
