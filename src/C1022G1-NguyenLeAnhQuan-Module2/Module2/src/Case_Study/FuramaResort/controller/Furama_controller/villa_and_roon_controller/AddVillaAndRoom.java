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
                    System.out.println("Nhập mã dịch vụ villa");
                    String serviceCodeVL = sc.nextLine();
                    System.out.println("Nhập tên villa");
                    String nameVL = sc.nextLine();
                    System.out.println("Nhập diện tích villa");
                    String areaVL = sc.nextLine();
                    System.out.println("Nhập giá của villa");
                    String priceVL = sc.nextLine();
                    System.out.println("Nhập số lượng người tối đa ở villa");
                    String maxPeopleVL = sc.nextLine();
                    System.out.println("Nhập kiểu thuê villa");
                    String typeRentVL = sc.nextLine();
                    System.out.println("Nhập chất lượng villa");
                    String quality = sc.nextLine();
                    System.out.println("Nhập diện tích villa");
                    String areaPool = sc.nextLine();
                    System.out.println("Nhập số tầng của villa");
                    String numberFloors = sc.nextLine();
                    Villa vl = new Villa(serviceCodeVL,nameVL, areaVL, priceVL, maxPeopleVL, typeRentVL, quality, areaPool, numberFloors);
                    FacilityController.iFS.addList(vl);
                    break;
                case 2:
                    System.out.println("Nhập mã dịch vụ room");
                    String serviceCodeRO = sc.nextLine();
                    System.out.println("Nhập tên room");
                    String nameRO = sc.nextLine();
                    System.out.println("Nhập diện tích room");
                    String areaRO = sc.nextLine();
                    System.out.println("Nhập tên giá của room");
                    String priceRO = sc.nextLine();
                    System.out.println("Nhập số lượng người tối đa ở room");
                    String maxPeopleRO = sc.nextLine();
                    System.out.println("Nhập kiểu thuê room");
                    String typeRentRO = sc.nextLine();
                    System.out.println("Nhập dịch vụ miễn phí của room");
                    String freeService = sc.nextLine();
                    Room ro = new Room(serviceCodeRO,nameRO,areaRO,priceRO,maxPeopleRO,typeRentRO,freeService);
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
