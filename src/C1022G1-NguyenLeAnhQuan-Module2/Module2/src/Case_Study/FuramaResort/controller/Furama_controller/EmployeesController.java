package Case_Study.FuramaResort.controller.Furama_controller;

import Case_Study.FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class EmployeesController {
    public static void employees(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Display list employees\n" +
                "2.Add new employee\n" +
                "3.Delete employee\n" +
                "4.Edit employee\n" +
                "5.Return main menu\n");
        do {
            int select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                    System.out.println("hello");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    FuramaController.displayMainMenu();
                    break;
            }
        }while (true);
    }

}
