package ss17.bai_tap.validate_class_name;

import java.util.Scanner;

public class ValidateClassName {
    public static final String REGEX_CLASSNAME = "^(C|A|P)+[0-9]{4}+(G|H|I|K|L|M)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String className = sc.nextLine();
        System.out.println(className.matches(REGEX_CLASSNAME));
    }
}
