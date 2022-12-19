package ss12.thuc_hanh;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi ký tự: ");
        String inputString = scanner.nextLine();
        int frequentChar[] = new int[255];
        for (int i = 0; i <inputString.length() ; i++) {
            Character ascii = inputString.charAt(i);
            frequentChar[ascii]++;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j <255 ; j++) {
            if(frequentChar[j]>max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");

        System.out.println("Độ phức tạp của bài toán: O(" + (inputString.length()+255) + ")");
    }
}
