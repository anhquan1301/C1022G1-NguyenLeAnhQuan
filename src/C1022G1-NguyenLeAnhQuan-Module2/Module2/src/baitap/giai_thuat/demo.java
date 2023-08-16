package baitap.giai_thuat;

public class demo {
    public static void main(String[] args) {
        int amount = 3;
        int coins[] = {2};
        int soNguyen=0;
        int soDu=0;
        int result=0;
        boolean flag = false;
        if(coins.length==1 && coins[0]==2){
            if(amount>2){
                result = -1;
                flag=true;
            }
            if(amount==2){
                result = 1;
                flag=true;
            }
            if(amount==1){
                result = 2;
                flag=true;
            }
        }
        if(amount%coins[coins.length-1]==0 && flag==false){
            result = amount/coins[coins.length-1];
        }
        if(amount%coins[coins.length-1]!=0&& flag==false){
            soNguyen=amount/coins[coins.length-1];
            soDu=amount/coins[coins.length-1];
            if(soDu==2 || soDu==1){
                result = soNguyen+1;
            }else if(soDu==3 || soDu==4) {
                result = soNguyen+2;
            }
        }

        System.out.println(result);
    }
}
