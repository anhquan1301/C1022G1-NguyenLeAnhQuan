package ss7.bai_tap.Interface_colorable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Hinh mangHinh[] = new Hinh[3];
        mangHinh[0] = new HinhVuong("blue",true,5);
        mangHinh[1] = new HinhChuNhat("red",false, 8.5,15.8);
        mangHinh[2] = new HinhTron( "yellow",true,10.5);
        System.out.println(Arrays.toString(mangHinh));
        System.out.println("Hình vuông");
        mangHinh[0].howToColor();
    }
}
