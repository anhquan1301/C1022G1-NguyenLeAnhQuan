package baitap.giai_thuat;

public class ThuatToanDaoChuoi {
    public static void main(String[] args) {
        String str = "dbc";
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse().toString();
        System.out.println(str1);

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.println(str.charAt(i));
        }
    }

}
