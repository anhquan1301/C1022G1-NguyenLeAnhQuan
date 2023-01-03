package Case_Study.FuramaResort.controller.Furama_controller;

import Case_Study.FuramaResort.controller.FuramaController;
import Case_Study.FuramaResort.model.model.extend_person.Customer;
import Case_Study.FuramaResort.model.model.extend_person.Employee;
import Case_Study.FuramaResort.model.service.classIplm.CustomerServiceIplm;
import Case_Study.FuramaResort.model.service.itf.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    private static ICustomerService iCS = new CustomerServiceIplm();
    public static void customer() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.Hiển thị danh sách khách hàng\n" +
                    "2.Thêm khách hàng mới\n" +
                    "3.Chỉnh sửa thông tin khách hàng\n" +
                    "4.Trở về menu chính\n");
            System.out.println("-----------------");
            System.out.println("Nhập lựa chọn của bạn");
            try{
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1:
                        iCS.displayList();
                        break;
                    case 2:
                        System.out.println("Nhập id khách hàng");
                        String id = sc.nextLine();
                        System.out.println("Nhập tên khách hàng");
                        String name = sc.nextLine();
                        System.out.println("Nhập ngày sinh khách hàng");
                        String date = sc.nextLine();
                        System.out.println("Nhập giới tính khách hàng");
                        String gender = sc.nextLine();
                        System.out.println("Nhập CMND khách hàng");
                        String cMND = sc.nextLine();
                        System.out.println("Nhập SĐT khách hàng");
                        String phone = sc.nextLine();
                        System.out.println("Nhập email khách hàng");
                        String email = sc.nextLine();
                        System.out.println("Nhập loại khách hàng");
                        String customerType = sc.nextLine();
                        System.out.println("Nhập địa chỉ khách hàng");
                        String address = sc.nextLine();
                        Customer customer = new Customer(id, name, date, gender, cMND, phone, email, customerType, address);
                        iCS.addList(customer);
                        break;
                    case 3:
                        System.out.println("Nhập id khách hàng cần sủa thông tin");
                        String idFixed = sc.nextLine();
                        Customer customerIdFixed = iCS.findById(idFixed);
                        if (customerIdFixed != null) {
                            System.out.println("Nhập tên mới khách hàng");
                            String nameNew = sc.nextLine();
                            System.out.println("Nhập ngày sinh mới khách hàng");
                            String dateNew = sc.nextLine();
                            System.out.println("Nhập giới tính mới khách hàng");
                            String genderNew = sc.nextLine();
                            System.out.println("Nhập CMND mới khách hàng");
                            String cMNDNew = sc.nextLine();
                            System.out.println("Nhập SĐT mới khách hàng");
                            String phoneNew = sc.nextLine();
                            System.out.println("Nhập email mới khách hàng");
                            String emailNew = sc.nextLine();
                            System.out.println("Nhập loại mới khách hàng");
                            String customerTypeNew = sc.nextLine();
                            System.out.println("Nhập địa chỉ mới khách hàng");
                            String addressNew = sc.nextLine();
                            customerIdFixed.setName(nameNew);
                            customerIdFixed.setDate(dateNew);
                            customerIdFixed.setGender(genderNew);
                            customerIdFixed.setcMND(cMNDNew);
                            customerIdFixed.setPhone(phoneNew);
                            customerIdFixed.setEmail(emailNew);
                            customerIdFixed.setCustomerType(customerTypeNew);
                            customerIdFixed.setAddress(addressNew);
                            iCS.updateInformation(customerIdFixed);
                            break;

                        }
                    case 4:
                        return;
                    default:
                        System.err.println("Nhập lại số từ 1 đến 4");
                }
            }catch (NumberFormatException e){
                System.err.println("Nhập lại 1 số");
            }
        }while (true) ;
    }
}