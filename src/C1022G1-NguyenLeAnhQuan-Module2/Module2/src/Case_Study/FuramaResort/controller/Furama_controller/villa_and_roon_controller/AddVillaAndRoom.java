package Case_Study.FuramaResort.controller.Furama_controller.villa_and_roon_controller;

import Case_Study.FuramaResort.controller.Furama_controller.FacilityController;
import Case_Study.FuramaResort.model.model.extend_facility.Room;
import Case_Study.FuramaResort.model.model.extend_facility.Villa;
import Case_Study.FuramaResort.ulti.regex.Validate;

import java.util.Scanner;

public class AddVillaAndRoom {
    public static void villaAndRoom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cú pháp nhập dữ liệu");
        System.out.println("-Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                "-Nếu là Villa thì XX sẽ là VL\n" +
                "-Nếu Room thì XX sẽ là RO\n" +
                "-Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường\n" +
                "-Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2\n" +
                "-Chi phí thuê phải là số dương\n" +
                "-Số lượng người tối đa phải >0 và nhỏ hơn <20\n" +
                "-Số tầng phải là số nguyên dương.\n" +
                "-Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ\n");
        System.out.println("-------------------------------------");
        do {
            System.out.println("1.Add New Villa\n" +
                    "2.Add new Room\n" +
                    "3.Back to menu\n");
            System.out.println("------------------");
            System.out.println("Input your choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    String serviceCodeVL;
                    do {
                        System.out.println("Nhập mã dịch vụ villa");
                         serviceCodeVL = sc.nextLine();
                    }while (!serviceCodeVL.matches(Validate.REGEX_SERVICE_CODE_VILLA));
                    String nameVL;
                    do {
                        System.out.println("Nhập tên villa");
                        nameVL = sc.nextLine();
                    }while (!nameVL.matches(Validate.REGEX_SERVICE_NAME));
                    String areaVL;
                    do {
                        System.out.println("Nhập diện tích villa");
                        areaVL = sc.nextLine();
                    }while (!areaVL.matches(Validate.REGEX_AREA));
                    String priceVL;
                    do {
                        System.out.println("Nhập giá của villa");
                        priceVL = sc.nextLine();
                    }while (!priceVL.matches(Validate.REGEX_PRICE));
                    String maxPeopleVL;
                    do {
                        System.out.println("Nhập số lượng người tối đa ở villa");
                        maxPeopleVL = sc.nextLine();
                    }while (!maxPeopleVL.matches(Validate.REGEX_MAX_PEOPLE));
                    String typeRentVL;
                    do {
                        System.out.println("Nhập kiểu thuê villa");
                        typeRentVL = sc.nextLine();
                    }while (!typeRentVL.matches(Validate.REGEX_TYPE_RENT));
                    String quality;
                    do {
                        System.out.println("Nhập chất lượng villa");
                        quality = sc.nextLine();
                    }while (!quality.matches(Validate.REGEX_QUALITY));
                    String areaPool;
                    do {
                        System.out.println("Nhập diện tích hồ bơi của villa");
                        areaPool = sc.nextLine();
                    }while (!areaPool.matches(Validate.REGEX_AREA));
                    String numberFloors;
                    do {
                        System.out.println("Nhập số tầng của villa");
                        numberFloors = sc.nextLine();
                    }while (!numberFloors.matches(Validate.REGEX_NUMBER_FLOORS));
                    Villa vl = new Villa(serviceCodeVL,nameVL, areaVL, priceVL, maxPeopleVL, typeRentVL, quality, areaPool, numberFloors);
                    FacilityController.iFS.addVilla(vl);
                    break;
                case 2:
                    String serviceCodeRO;
                    do {
                        System.out.println("Nhập mã dịch vụ room");
                        serviceCodeRO = sc.nextLine();
                    }while (!serviceCodeRO.matches(Validate.REGEX_SERVICE_CODE_ROOM));
                    String nameRO;
                    do {
                        System.out.println("Nhập tên room");
                         nameRO = sc.nextLine();
                    }while (!nameRO.matches(Validate.REGEX_SERVICE_NAME));
                    String areaRO;
                    do {
                        System.out.println("Nhập diện tích room");
                        areaRO = sc.nextLine();
                    }while (!areaRO.matches(Validate.REGEX_AREA));
                    String priceRO;
                    do {
                        System.out.println("Nhập tên giá của room");
                        priceRO = sc.nextLine();
                    }while (!priceRO.matches(Validate.REGEX_PRICE));
                    String maxPeopleRO;
                    do {
                        System.out.println("Nhập số lượng người tối đa ở room");
                        maxPeopleRO = sc.nextLine();
                    }while (!maxPeopleRO.matches(Validate.REGEX_MAX_PEOPLE));
                    String typeRentRO;
                    do {
                        System.out.println("Nhập kiểu thuê room");
                        typeRentRO = sc.nextLine();
                    }while (!typeRentRO.matches(Validate.REGEX_TYPE_RENT));
                    System.out.println("Nhập dịch vụ miễn phí của room");
                    String freeService = sc.nextLine();
                    Room ro = new Room(serviceCodeRO,nameRO,areaRO,priceRO,maxPeopleRO,typeRentRO,freeService);
                    FacilityController.iFS.addRoom(ro);
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
