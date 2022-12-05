package ss1.baitap;

import java.util.Scanner;

public class NhapSoDoiThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number: ");
        short numb = scanner.nextShort();
        if (numb>=0 && numb<10){
            switch (numb){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("True");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        if(numb>=10 && numb<20){
            int ones = numb % 10;
            switch (numb){
                case 10:
                    System.out.println("Hàng đơn vị: " + ones );
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Hàng đơn vị: " + ones );
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Hàng đơn vị: " + ones );
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Hàng đơn vị: " + ones );
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Hàng đơn vị: " + ones );
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Hàng đơn vị: " + ones );
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Hàng đơn vị: " + ones );
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Hàng đơn vị: " + ones );
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Hàng đơn vị: " + ones );
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Hàng đơn vị: " + ones );
                    System.out.println("Nineteen");
                    break;
            }
        }
        if (numb>=20 && numb<100){
            int tens = numb/10;
            int ones = numb % 10;
            switch (tens){
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Forty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
        }
            switch (ones){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("True");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

        }
        if (numb > 99 && numb < 1000) {
            int hundreds = numb / 100;
            int residualHundreds = numb - hundreds * 100;
            int dozens = residualHundreds / 10;
            int unit = residualHundreds - dozens * 10;
            String strHundreds;
            String strDozens = "";
            String strUnit;
            switch (hundreds) {
                case 1:
                    strHundreds = "One";
                    break;
                case 2:
                    strHundreds = "Two";
                    break;
                case 3:
                    strHundreds = "Three";
                    break;
                case 4:
                    strHundreds = "Four";
                    break;
                case 5:
                    strHundreds = "Five";
                    break;
                case 6:
                    strHundreds = "Six";
                    break;
                case 7:
                    strHundreds = "Seven";
                    break;
                case 8:
                    strHundreds = "Eight";
                    break;
                default:
                    strHundreds = "Nine";
            }
            if (dozens == 1) {
                switch (unit) {
                    case 1:
                        strUnit = "Eleven";
                        break;
                    case 2:
                        strUnit = "Twelve";
                        break;
                    case 3:
                        strUnit = "Thirteen";
                        break;
                    case 4:
                        strUnit = "Fourteen";
                        break;
                    case 5:
                        strUnit = "Fifteen";
                        break;
                    case 6:
                        strUnit = "Sixteen";
                        break;
                    case 7:
                        strUnit = "Seventeen";
                        break;
                    case 8:
                        strUnit = "Eighteen";
                        break;
                    case 9:
                        strUnit = "Nineteen";
                        break;
                    default:
                        strUnit = "Ten";
                }
            } else {
                switch (dozens) {
                    case 2:
                        strDozens = "Twenty";
                        break;
                    case 3:
                        strDozens = "Thirty";
                        break;
                    case 4:
                        strDozens = "Forty";
                        break;
                    case 5:
                        strDozens = "Fifty";
                        break;
                    case 6:
                        strDozens = "Sixty";
                        break;
                    case 7:
                        strDozens = "Seventy";
                        break;
                    case 8:
                        strDozens = "Eighty";
                        break;
                    case 9:
                        strDozens = "Ninety";
                        break;
                    default:
                        strDozens = "";
                }
                switch (unit) {
                    case 1:
                        strUnit = "One";
                        break;
                    case 2:
                        strUnit = "Two";
                        break;
                    case 3:
                        strUnit = "Three";
                        break;
                    case 4:
                        strUnit = "Four";
                        break;
                    case 5:
                        strUnit = "Five";
                        break;
                    case 6:
                        strUnit = "Six";
                        break;
                    case 7:
                        strUnit = "Seven";
                        break;
                    case 8:
                        strUnit = "Eight";
                        break;
                    case 9:
                        strUnit = "Nine";
                        break;
                    default:
                        strUnit = "";
                }
            }
            System.out.println(strHundreds + " hundred and " + strDozens + " " + strUnit);
        }
        else {
            System.out.println("Out of ability");
        }
    }

}
