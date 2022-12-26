package Case_Study.FuramaResort.controller.Furama_controller;

import Case_Study.FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class FacilityController {
    public static void facility(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Display list facility\n" +
                "2.Add new facility\n" +
                "3.Display list facility maintenance\n" +
                "4.Return main menu\n");
        do {
            System.out.println("Input your choice");
            int select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                    System.out.println("Chào");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.err.println("Please input again");
            }
        }while (true);
    }
}
