package baitap.giai_thuat;

public class MaHoaBucThu {
    public static void main(String[] args) {
        String encodedContent = "margorpgnim";
        int key = 7;
        String result = "";
        for (int i = key-1; i>=0; i--) {
            result += encodedContent.charAt(i);
        }
        for (int i = encodedContent.length()-1; i >= key ; i--) {
            result += encodedContent.charAt(i);
        }
        System.out.println(result);
    }
}
