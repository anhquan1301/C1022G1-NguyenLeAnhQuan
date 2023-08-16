package baitap.giai_thuat;

public class TimMangDoiXung {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        int j =  arr.length-1;
        boolean flag = true;
        for (int i = 0; i <arr.length/2 ; i++) {
            if(arr[i]!=arr[j]){
                flag=false;
                break;
            }
            j--;
        }
        System.out.println(flag);
    }
}
