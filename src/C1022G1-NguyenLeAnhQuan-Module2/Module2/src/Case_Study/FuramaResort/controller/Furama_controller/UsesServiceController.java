package Case_Study.FuramaResort.controller.Furama_controller;

import Case_Study.FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class UsesServiceController {
    public static void usesService(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Hiển thị danh sách dịch vụ miễn phí\n" +
                    "2.Hiển thị danh sách khách hàng được ưu đãi\n" +
                    "3.Trở về menu chính\n");
            System.out.println("-----------------");
            System.out.println("Nhập lựa chọn của bạn");
            try {
                int select = Integer.parseInt(sc.nextLine());
                switch (select){
                    case 1:
                        System.out.println("Chào 5");
                        break;
                    case 2:
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Nhập lại lựa chọn của bạn");
                }
            }catch (NumberFormatException e){
                System.err.println("Nhập lại 1 số");
            }

        }while (true);
    }
}
