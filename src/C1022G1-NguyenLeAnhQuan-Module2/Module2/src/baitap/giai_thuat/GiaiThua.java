package baitap.giai_thuat;

public class GiaiThua {
    public static void main(String[] args) {
        int a = 12;
        String s = "";
        int n = 1;
        for (int i = 1; i <= a; i++) {
            n *= i;
        }
        s = String.valueOf(n);
        int rs = 0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)!='0'){
                rs = Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(rs);
    }
}
