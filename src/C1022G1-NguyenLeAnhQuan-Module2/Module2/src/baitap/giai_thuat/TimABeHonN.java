package baitap.giai_thuat;

public class TimABeHonN {
    public static void main(String[] args) {
        int n = 234;
        int a = 0;
        int sumM = 0;
        int sumB = 0;
        int rs = 0;
        for (int i = 0; i <(n+"").length(); i++) {
            sumM += Integer.parseInt(((n+"").charAt(i))+"");
        }
        while (a<n){
            if((a+"").length()==(n+"").length()){
                for (int i = 0; i < (a+"").length(); i++) {
                    sumB += Integer.parseInt(((a+"").charAt(i))+"");
                }
                if(sumB!=sumM){
                    sumB=0;
                }
                if(sumB==sumM){
                    rs = a;
                }
            }
            a++;
        }
        System.out.println(rs);
    }
}
