package baitap.giai_thuat;

public class bc {
    public static boolean abc(String s) {
        String n[] = s.split("");
        int m[] = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            m[i] = Integer.parseInt(n[i]);
        }
        int sum;
        int sum1;
        boolean flag = false;
        for (int i = 0; i < m.length; i++) {
            sum = 0;
            sum1 = 0;
            for (int j = 0; j < i; j++) {
                sum += m[j];
            }
            for (int k = i + 1; k < m.length; k++) {
                sum1 += m[k];
            }
            if (sum == sum1) {
                flag = true;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        String s = "1233";
        System.out.println(abc(s));
    }
}