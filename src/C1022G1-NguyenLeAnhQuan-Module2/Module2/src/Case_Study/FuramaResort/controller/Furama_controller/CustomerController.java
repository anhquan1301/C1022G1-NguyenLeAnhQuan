package Case_Study.FuramaResort.controller.Furama_controller;

import Case_Study.FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class CustomerController {
    public static void customer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Display list customers\n" +
                "2.Add new customer\n" +
                "3.Edit customer\n" +
                "4.Return main menu\n");
        do {
            int select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                    System.out.println("hi");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
            }
        }while (true);
    }
}
