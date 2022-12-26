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
            System.out.println("1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n");
            System.out.println("Input your choice");
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
                    System.err.println("Please input again");
            }
        }while (true);
    }
}
