package baitap.giai_thuat;

public class DaoNguocSo {
    public static void main(String[] args) {
        int numb = 123;
        int numbReverse=0;

        while (numb>0){
           int numb2 = numb%10;
           numbReverse = (numbReverse*10)+numb2;
           numb = numb / 10;
        }
        System.out.println(numbReverse);
    }
}
