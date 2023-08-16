package baitap.OCA;

public class OCA_6 {
    public static void main(String[] args) {
//        String ta = "A ";
//        ta = ta.concat("B ");
//        String tb = "C ";
//        ta = ta.concat(tb);
//        ta.replace('C','D');
//        ta = ta.concat(tb);
//        System.out.println(ta);

        StringBuilder sb = new StringBuilder(5);
        String s = "";
        if(sb.equals(s)){
            System.out.println("Match 1");
        }else if(sb.toString().equals(s)){
            System.out.println("Match 2");
        }else {
            System.out.println("No Match");
        }
    }
}
