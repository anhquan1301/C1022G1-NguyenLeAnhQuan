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
            System.out.println("1.Hiển thị danh sách cơ sở cho thuê\n" +
                    "2.Thêm cơ sở mới\n" +
                    "3.Hiển thị danh sách cơ sở đang bảo trì\n" +
                    "4.Trở về menu chính\n");
            System.out.println("-----------------");
            System.out.println("Nhập lựa chọn của bạn");
            try {
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
                        return;
                    default:
                        System.err.println("Nhập số từ 1 đến 4");
                }
            }catch (NumberFormatException e){
                System.err.println("Nhập lại 1 số");
            }

        } while (true);
    }
}
