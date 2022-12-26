package ss17.bai_tap.validate_phone_number;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static final String REGEX_PHONENUMBER = "^[(]+[0-9]{2}+[)]+[-]+[(]+[0]+[0-9]{9}+[)]$";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại");
        String phoneNumber = sc.nextLine();
        System.out.println(phoneNumber.matches(REGEX_PHONENUMBER));
    }
}
