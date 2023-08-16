package baitap.giai_thuat;

public class MangConTrungLap {
    public static void main(String[] args) {
        String parentString = "1 4 5 2 1 4 5 2";
        String childString = "1 2 4 5";
        String result = "0";
        int count=0;
        int length=0;
        boolean flag = false;
        for (int i = 0; i < childString.length() ; i++) {
            if(childString.charAt(i) != ' '){
                length++;
                if(parentString.indexOf(childString.charAt(i)) == -1){
                    flag=true;
                    break;
                }
            }
            for (int j = 0; j < parentString.length(); j++) {
                if(childString.charAt(i) != ' '){
                    if(childString.charAt(i)==parentString.charAt(j)){
                        count++;
                    }
                }
            }
        }
        if(flag){
            result="0";
        }else {
            result = String.valueOf(count/length);
        }
        System.out.println(length);
        System.out.println(result);
    }
}
