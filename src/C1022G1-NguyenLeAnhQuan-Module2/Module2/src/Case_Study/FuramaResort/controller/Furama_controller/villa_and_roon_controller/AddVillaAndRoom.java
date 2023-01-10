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
            System.out.println("1.Thêm mới villa\n" +
                    "2.Thêm mới room\n" +
                    "3.Trở về menu chính\n");
            System.out.println("------------------");
            System.out.println("Nhập lựa chọn của bạn");
            try{
               int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        String serviceCodeVL;
                        do {
                            System.out.println("Nhập mã dịch vụ villa");
                            serviceCodeVL = sc.nextLine();
                            if(!serviceCodeVL.matches(Validate.REGEX_SERVICE_CODE_VILLA)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!serviceCodeVL.matches(Validate.REGEX_SERVICE_CODE_VILLA));
                        String nameVL;
                        do {
                            System.out.println("Nhập tên villa");
                            nameVL = sc.nextLine();
                            if(!nameVL.matches(Validate.REGEX_SERVICE_NAME)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!nameVL.matches(Validate.REGEX_SERVICE_NAME));
                        String areaVL;
                        do {
                            System.out.println("Nhập diện tích villa");
                            areaVL = sc.nextLine();
                            if(!areaVL.matches(Validate.REGEX_AREA)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!areaVL.matches(Validate.REGEX_AREA));
                        String priceVL;
                        do {
                            System.out.println("Nhập giá của villa");
                            priceVL = sc.nextLine();
                            if(!priceVL.matches(Validate.REGEX_PRICE)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!priceVL.matches(Validate.REGEX_PRICE));
                        String maxPeopleVL;
                        do {
                            System.out.println("Nhập số lượng người tối đa ở villa");
                            maxPeopleVL = sc.nextLine();
                            if(!maxPeopleVL.matches(Validate.REGEX_MAX_PEOPLE)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!maxPeopleVL.matches(Validate.REGEX_MAX_PEOPLE));
                        String typeRentVL;
                        do {
                            System.out.println("Nhập kiểu thuê villa");
                            typeRentVL = sc.nextLine();
                            if(!typeRentVL.matches(Validate.REGEX_TYPE_RENT)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!typeRentVL.matches(Validate.REGEX_TYPE_RENT));
                        String quality;
                        do {
                            System.out.println("Nhập chất lượng villa");
                            quality = sc.nextLine();
                            if(!quality.matches(Validate.REGEX_QUALITY)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!quality.matches(Validate.REGEX_QUALITY));
                        String areaPool;
                        do {
                            System.out.println("Nhập diện tích hồ bơi của villa");
                            areaPool = sc.nextLine();
                            if(!areaPool.matches(Validate.REGEX_AREA)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!areaPool.matches(Validate.REGEX_AREA));
                        String numberFloors;
                        do {
                            System.out.println("Nhập số tầng của villa");
                            numberFloors = sc.nextLine();
                            if(!numberFloors.matches(Validate.REGEX_NUMBER_FLOORS)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!numberFloors.matches(Validate.REGEX_NUMBER_FLOORS));
                        Villa vl = new Villa(serviceCodeVL,nameVL, areaVL, priceVL, maxPeopleVL, typeRentVL, quality, areaPool, numberFloors);
                        FacilityController.iFS.addVilla(vl);
                        break;
                    case 2:
                        String serviceCodeRO;
                        do {
                            System.out.println("Nhập mã dịch vụ room");
                            serviceCodeRO = sc.nextLine();
                            if(!serviceCodeRO.matches(Validate.REGEX_SERVICE_CODE_ROOM)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!serviceCodeRO.matches(Validate.REGEX_SERVICE_CODE_ROOM));
                        String nameRO;
                        do {
                            System.out.println("Nhập tên room");
                            nameRO = sc.nextLine();
                            if(!nameRO.matches(Validate.REGEX_SERVICE_NAME)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!nameRO.matches(Validate.REGEX_SERVICE_NAME));
                        String areaRO;
                        do {
                            System.out.println("Nhập diện tích room");
                            areaRO = sc.nextLine();
                            if(!areaRO.matches(Validate.REGEX_AREA)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!areaRO.matches(Validate.REGEX_AREA));
                        String priceRO;
                        do {
                            System.out.println("Nhập tên giá của room");
                            priceRO = sc.nextLine();
                            if(!priceRO.matches(Validate.REGEX_PRICE)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!priceRO.matches(Validate.REGEX_PRICE));
                        String maxPeopleRO;
                        do {
                            System.out.println("Nhập số lượng người tối đa ở room");
                            maxPeopleRO = sc.nextLine();
                            if(!maxPeopleRO.matches(Validate.REGEX_MAX_PEOPLE)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!maxPeopleRO.matches(Validate.REGEX_MAX_PEOPLE));
                        String typeRentRO;
                        do {
                            System.out.println("Nhập kiểu thuê room");
                            typeRentRO = sc.nextLine();
                            if(!typeRentRO.matches(Validate.REGEX_TYPE_RENT)){
                                System.err.println("Nhập lại đúng cú pháp");
                            }
                        }while (!typeRentRO.matches(Validate.REGEX_TYPE_RENT));
                        System.out.println("Nhập dịch vụ miễn phí của room");
                        String freeService = sc.nextLine();
                        Room ro = new Room(serviceCodeRO,nameRO,areaRO,priceRO,maxPeopleRO,typeRentRO,freeService);
                        FacilityController.iFS.addRoom(ro);
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Nhập lại số từ 1 đến 3");
                }
            }catch (NumberFormatException e){
                System.err.println("Nhập lại 1 số");
            }
        } while (true);
    }
}
