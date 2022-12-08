package baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;
public class SoNguyen {
    public static boolean soNguyenTo(int numb) {
        int count = 0;
        for (int i = 1; i <= numb; i++) {
            if (numb % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số truyền vào: ");
        int numb = Integer.parseInt(sc.nextLine());
        int a = 0;
        int b = 1;
        int c = 1;
        int i = 0;
        int count = 0;
        int result=0;
        while (i <= numb) {
            a = b;
            b = c;
            c = a + b;
            if (soNguyenTo(c) == true && c < numb) {
                count++;
                int arr[] = new int[count];
                for (int j = 0; j <count ; j++) {
                    arr[j]=c;
                    result = arr[j];
                }
                System.out.println(result);
            }
            i++;
        }
    }
}
