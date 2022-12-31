package baitap.giai_thuat;

public class b {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "Uykhldg1";
        String s3 = "";
        for(int i=0;i<s1.length();i++){
            for (int j=0; j <s2.length();j++) {
                if(s1.charAt(i)==s2.charAt(j)) {
                    s3 += s2.charAt(j);
                    j=-1;
                         if(j!=s2.length()-1) {
                             i++;
                         }
                }
            }
        }
        System.out.println(s3);
    }
}
