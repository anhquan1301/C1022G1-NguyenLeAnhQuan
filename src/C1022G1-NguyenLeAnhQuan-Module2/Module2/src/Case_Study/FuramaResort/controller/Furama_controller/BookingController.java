package Case_Study.FuramaResort.controller.Furama_controller;

import Case_Study.FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class BookingController {
    public static void booking(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Thêm 1 lần đặt dịch vụ mới\n" +
                    "2.Hiển thị danh sách đặt dịch vụ\n" +
                    "3.Trở về menu chính\n");
            System.out.println("-----------------");
            System.out.println("Nhập lựa chọn của bạn");
            try {
                int select = Integer.parseInt(sc.nextLine());
                switch (select){
                    case 1:
                        System.out.println("Chào 4");
                        break;
                    case 2:
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Nhập lại số từ 1 đến 3");
                }
            }catch (NumberFormatException e){
                System.err.println("Nhập lại 1 số");
            }
        }while (true);
    }
}
