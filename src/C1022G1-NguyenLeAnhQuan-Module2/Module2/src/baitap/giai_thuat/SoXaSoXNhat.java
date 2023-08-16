package baitap.giai_thuat;

public class SoXaSoXNhat {
    public static void main(String[] args) {
        String  s = "22343534.12 42312312.13 7235345.154 0 -5";
        float x = 42312312.12f;
        float y = 0;
        double result = 0;
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(Float.parseFloat(arr[i]) - x) - x > y){
                result = Double.parseDouble(arr[i]);
                y = Math.abs(Float.parseFloat(arr[i]) - x);
            }
        }
        System.out.println( (float) result);

    }
}
