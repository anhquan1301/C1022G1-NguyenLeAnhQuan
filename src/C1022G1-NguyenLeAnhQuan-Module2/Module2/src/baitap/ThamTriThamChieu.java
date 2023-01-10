package baitap;

public class ThamTriThamChieu {
    public static void thamTri(int a, int b){
         a = a+5;
         b = b+5;
    }
    public static void thamChieu(String a, String b){
         a = a+"m";
         b = b+"n";

    }
    public static void main(String[] args) {
        int c=10;
        int d=5;
        thamTri(c,d);
        System.out.println(c);
        System.out.println(d);
        String a= new String("abc");
        String b="def";
        thamChieu(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
