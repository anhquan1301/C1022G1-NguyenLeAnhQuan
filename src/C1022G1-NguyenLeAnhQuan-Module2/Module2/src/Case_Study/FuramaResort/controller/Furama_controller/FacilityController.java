package Case_Study.FuramaResort.controller.Furama_controller;

import Case_Study.FuramaResort.controller.FuramaController;
import Case_Study.FuramaResort.controller.Furama_controller.villa_and_roon_controller.AddVillaAndRoom;
import Case_Study.FuramaResort.model.model.extend_facility.Villa;
import Case_Study.FuramaResort.model.service.classIplm.FacilityServiceIplm;
import Case_Study.FuramaResort.model.service.itf.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    public static IFacilityService iFS = new FacilityServiceIplm();
    public static void facility() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu\n");
            System.out.println("-----------------");
            System.out.println("Input your choice");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    iFS.displayList();
                    break;
                case 2:
                    AddVillaAndRoom.villaAndRoom();
                    break;
                case 3:
                    iFS.displayListFacilityMaintenance();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.err.println("Please input again");
            }
        } while (true);
    }
}
