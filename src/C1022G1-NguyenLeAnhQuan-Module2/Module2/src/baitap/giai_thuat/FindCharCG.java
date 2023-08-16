package baitap.giai_thuat;

import java.util.Arrays;

public class FindCharCG {
    public static void main(String[] args) {
        String str = "abcbbdceffff";
        char [] arrChar = str.toCharArray();
        char [] newChar = new char[str.length()];
        boolean[] seenChar = new boolean[128];
        Arrays.sort(arrChar);
        int count = 0;
        for (int i = 1; i < arrChar.length; i++) {
            if (arrChar[i - 1] == arrChar[i]) {
                if (!seenChar[arrChar[i]]) {
                    newChar[count++] = arrChar[i];
                    seenChar[arrChar[i]] = true;

                }
            }
        }
//        return Arrays.copyOf(newChar,count);
    }
}
