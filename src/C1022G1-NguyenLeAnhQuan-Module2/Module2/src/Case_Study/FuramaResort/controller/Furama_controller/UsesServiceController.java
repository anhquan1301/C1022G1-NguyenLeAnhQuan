package Case_Study.FuramaResort.controller.Furama_controller;

import Case_Study.FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class UsesServiceController {
    public static void usesService(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Display list customers use service\n" +
                "2.Display list customers get voucher\n" +
                "3.Return main menu\n");
        do {
            System.out.println("Input your choice");
            int select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                    System.out.println("Chào 5");
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.err.println("Please input again");
            }
        }while (true);
    }
}
