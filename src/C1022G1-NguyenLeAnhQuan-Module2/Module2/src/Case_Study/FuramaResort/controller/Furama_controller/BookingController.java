package Case_Study.FuramaResort.controller.Furama_controller;

import Case_Study.FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class BookingController {
    public static void booking(){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Return main menu\n");
            System.out.println("-----------------");
            System.out.println("Input your choice");
            int select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                    System.out.println("Chào 4");
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
