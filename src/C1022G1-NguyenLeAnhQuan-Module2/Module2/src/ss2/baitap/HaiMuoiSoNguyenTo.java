package ss2.baitap;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HaiMuoiSoNguyenTo {
    public static void main(String[] args) {
        int i;
        int countCheck = 0;
        int j=2;
        System.out.println("20 số nguyên tố đầu tiên");
        while (j>=2 && countCheck<20){
            int count = 0;
            for (i=1;i<=j;i++){
                if(j%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(j);
                countCheck++;
            }
            j++;
        }
    }
}