package Case_Study.FuramaResort.model.model;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        System.out.println("***Furuma Resort***");
        System.out.println("-------------------");
        System.out.println("1.Employee Management\n" +
                "2.Customer Management\n" +
                "3.Facility Management \n" +
                "4.Booking Management\n" +
                "5.Promotion Management\n" +
                "6.Exit\n");
        Scanner sc = new Scanner(System.in);
        do {
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
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
                                displayMainMenu();
                                break;
                        }
                    }while (true);
                case 2:
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
                                displayMainMenu();
                                break;
                        }
                    }while (true);
                case 3:
                    System.out.println("1.Display list facility\n" +
                            "2.Add new facility\n" +
                            "3.Display list facility maintenance\n" +
                            "4.Return main menu\n");
                    do {
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
                                displayMainMenu();
                                break;
                        }
                    }while (true);
                case 4:
                    System.out.println("1.Add new booking\n" +
                            "2.Display list booking\n" +
                            "3.Return main menu\n");
                    do {
                        int select = Integer.parseInt(sc.nextLine());
                        switch (select){
                            case 1:
                                System.out.println("Chào 4");
                                break;
                            case 2:
                                break;
                            case 3:
                                displayMainMenu();
                                break;
                        }
                    }while (true);
                case 5:
                    System.out.println("1.Display list customers use service\n" +
                            "2.Display list customers get voucher\n" +
                            "3.Return main menu\n");
                    do {
                        int select = Integer.parseInt(sc.nextLine());
                        switch (select){
                            case 1:
                                System.out.println("Chào 5");
                                break;
                            case 2:
                                break;
                            case 3:
                                displayMainMenu();
                                break;
                        }
                    }while (true);
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Please input again");
            }
        }while (true);
    }
}
