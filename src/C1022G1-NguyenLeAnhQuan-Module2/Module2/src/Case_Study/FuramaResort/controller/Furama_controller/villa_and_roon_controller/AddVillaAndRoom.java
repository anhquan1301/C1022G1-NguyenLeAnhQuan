package Case_Study.FuramaResort.controller.Furama_controller.villa_and_roon_controller;

import Case_Study.FuramaResort.controller.Furama_controller.FacilityController;
import Case_Study.FuramaResort.model.model.Facility;
import Case_Study.FuramaResort.model.model.extend_facility.Room;
import Case_Study.FuramaResort.model.model.extend_facility.Villa;

import java.util.Scanner;

public class AddVillaAndRoom {
    public static void villaAndRoom() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Add New Villa\n" +
                    "2.Add new Room\n" +
                    "3.Back to menu\n");
            System.out.println("------------------");
            System.out.println("Input your choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên villa");
                    String nameVL = sc.nextLine();
                    System.out.println("Nhập diện tích villa");
                    double areaVL = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập giá của villa");
                    int priceVL = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập số lượng người tối đa ở villa");
                    int maxPeopleVL = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập kiểu thuê villa");
                    String typeRentVL = sc.nextLine();
                    System.out.println("Nhập chất lượng villa");
                    String quality = sc.nextLine();
                    System.out.println("Nhập diện tích villa");
                    double areaPool = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập số tầng của villa");
                    int numberFloors = Integer.parseInt(sc.nextLine());
                    Villa vl = new Villa(nameVL, areaVL, priceVL, maxPeopleVL, typeRentVL, quality, areaPool, numberFloors);
                    FacilityController.iFS.addList(vl);
                    break;
                case 2:
                    System.out.println("Nhập tên room");
                    String nameRO = sc.nextLine();
                    System.out.println("Nhập diện tích room");
                    double areaRO = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập tên giá của room");
                    int priceRO = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập số lượng người tối đa ở room");
                    int maxPeopleRO = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập kiểu thuê room");
                    String typeRentRO = sc.nextLine();
                    System.out.println("Nhập dịch vụ miễn phí của room");
                    String freeService = sc.nextLine();
                    Room ro = new Room(nameRO,areaRO,priceRO,maxPeopleRO,typeRentRO,freeService);
                    FacilityController.iFS.addList(ro);
                    break;
                case 3:
                    FacilityController.facility();
                    break;
                default:
                    System.err.println("Please input again");
            }
        } while (true);
    }
}
