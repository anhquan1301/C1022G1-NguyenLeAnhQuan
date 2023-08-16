package baitap.giai_thuat;

public class SuaChuoiNoiLien {
    public static void main(String[] args) {
        String s = "Da Nang";
        String s1 = s.toLowerCase();
        String s2 ="";
        for (int i = 1; i <s.length(); i++) {
            if(s.charAt(i)!=s1.charAt(i) && s1.charAt(i-1) != ' '){
                s2 += " ";
            }
                s2 += s1.charAt(i);

        }
        System.out.println((s1.charAt(0) + s2));

    }
}
