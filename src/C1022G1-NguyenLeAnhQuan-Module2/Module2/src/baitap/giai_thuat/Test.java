package baitap.giai_thuat;

public class Test {

    public static void main(String[] a) {
        //Hãy kiểm tra đoạn code sau đây và trả lời câu hỏi bên dưới

        int ac = 10;

        int b = 2;


        if(ac != 10){

            ac = b;

        } else if(ac == 10 || b > 5){

            ac /= 2;

            b++;

        } else

            b += ac;

        b += 2;

        System.out.println(ac + " " + b);


    }

}