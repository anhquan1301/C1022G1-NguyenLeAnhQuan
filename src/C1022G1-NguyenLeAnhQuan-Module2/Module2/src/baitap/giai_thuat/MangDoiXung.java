package baitap.giai_thuat;

public class MangDoiXung {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,1};
        int j = arr.length-1;
        boolean flag = false;
        for (int i = 0; i <arr.length/2 ; i++) {
            if(arr[i] == arr[j]){
                flag = true;
                j--;
            }else {
                flag=false;
            }
        }
        if(flag){
            System.out.println("Mảng đối xứng");
        }else {
            System.out.println("Không phải mảng đối xứng");
        }

    }
}
