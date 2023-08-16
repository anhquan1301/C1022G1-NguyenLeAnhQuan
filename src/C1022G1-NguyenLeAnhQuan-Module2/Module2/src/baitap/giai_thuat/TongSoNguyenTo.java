package baitap.giai_thuat;

public class TongSoNguyenTo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,11,13,20};
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            int count = 0;
            for (int j = 1; j<=arr[i]; j++) {
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count==2){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }


}
