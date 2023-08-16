package baitap.giai_thuat;

public class MangDep {
    public static void main(String[] args) {
        boolean flag = false;
        int[] a = {1,3,1};
        int b =0, c = 0, x = a.length/2, j = a.length-1;
        for (int i = 0; i < x ; i++) {
            b += a[i];
            c +=a[j];
            j--;
        }
        if(a.length%2==0&&(b-a[x] == c || b == c-a[x])){
            flag=true;
        }
        if(b==c){
            flag=true;
        }
        System.out.println(flag);
    }
}
