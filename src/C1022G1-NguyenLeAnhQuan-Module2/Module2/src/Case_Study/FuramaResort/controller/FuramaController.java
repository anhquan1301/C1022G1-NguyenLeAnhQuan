package Case_Study.FuramaResort.controller;

import Case_Study.FuramaResort.controller.Furama_controller.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("***Furuma Resort***");
            System.out.println("-------------------");
            System.out.println("1.Quản lí nhân viên\n" +
                    "2.Quản lí khách hàng\n" +
                    "3.Quản lí cơ sở vật chất\n" +
                    "4.Quản lí đặt dịch vụ\n" +
                    "5.Quản lí dịch vụ khuyến mãi\n" +
                    "6.Thoát lựa chọn\n");
            System.out.println("Nhập lựa chọn của bạn");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        EmployeesController.employees();
                        break;
                    case 2:
                        CustomerController.customer();
                        break;
                    case 3:
                        FacilityController.facility();
                        break;
                    case 4:
                        BookingController.booking();
                        break;
                    case 5:
                        UsesServiceController.usesService();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:


                        System.err.println("Nhập lại từ 1 đến 6");
                }
            } catch (NumberFormatException e){
                System.err.println("Nhập lại 1 số");
            }
        }while (true);
    }
}
