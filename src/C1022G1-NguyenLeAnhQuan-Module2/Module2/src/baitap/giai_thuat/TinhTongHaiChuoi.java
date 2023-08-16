package baitap.giai_thuat;

public class TinhTongHaiChuoi {


    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("11:20:30");
        StringBuilder str2 = new StringBuilder("07:35:45");
//        for (int i = 0; i < str1.length(); i++) {
//            if(str1.charAt(i)==':'){
//                str1.deleteCharAt(i);
//                str2.deleteCharAt(i);
//            }
//        }
        str1.deleteCharAt(2);
        str1.deleteCharAt(4);
        str2.deleteCharAt(2);
        str2.deleteCharAt(4);
       int rs = Integer.parseInt(String.valueOf(str1))+ Integer.parseInt(String.valueOf(str2));
        StringBuilder str3 = new StringBuilder(String.valueOf(rs));
        str3.insert(2,':');
        str3.insert(5,':');
        System.out.println(str3);
    }
}
