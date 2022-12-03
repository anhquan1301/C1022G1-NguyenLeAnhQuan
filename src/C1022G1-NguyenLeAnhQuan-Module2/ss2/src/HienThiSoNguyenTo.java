public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Những số nguyên tố dưới 100");
        for (int j=2;j<100;j++){
            int count = 0;
            for (int i=1;i<=j;i++){
                if(j%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(j);
            }
        }
    }
}
