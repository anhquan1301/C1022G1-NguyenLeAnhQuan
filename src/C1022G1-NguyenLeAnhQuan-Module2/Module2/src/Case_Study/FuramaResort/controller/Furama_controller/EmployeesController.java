package Case_Study.FuramaResort.controller.Furama_controller;

import Case_Study.FuramaResort.controller.FuramaController;
import Case_Study.FuramaResort.model.model.extend_person.Employee;
import Case_Study.FuramaResort.model.service.classIplm.EmployeeServiceIplm;
import Case_Study.FuramaResort.model.service.itf.IEmployeesService;
import Case_Study.FuramaResort.ulti.exception.NotFoundException;

import java.util.Scanner;

public class EmployeesController {
    private static IEmployeesService iES = new EmployeeServiceIplm();
    public static void employees(){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.Hiển thị danh sách nhân viên\n" +
                    "2.Thêm nhân viên mới\n" +
                    "3.Xóa nhân viên bằng mã nhân viên\n" +
                    "4.Chỉnh sửa thông tin nhân viên\n" +
                    "5.Trở về menu chính\n");
            System.out.println("-----------------");
            System.out.println("Nhập lựa chọn của bạn");
            try{
                int select = Integer.parseInt(sc.nextLine());
                switch (select){
                    case 1:
                        iES.displayList();
                        break;
                    case 2:
                        System.out.println("Nhập id nhân viên");
                        String id = sc.nextLine();
                        System.out.println("Nhập tên nhân viên");
                        String name = sc.nextLine();
                        System.out.println("Nhập ngày sinh nhân viên");
                        String date  = sc.nextLine();
                        System.out.println("Nhập giới tính nhân viên");
                        String gender = sc.nextLine();
                        System.out.println("Nhập CMND nhân viên");
                        String cMND = sc.nextLine();
                        System.out.println("Nhập SĐT nhân viên");
                        String phone = sc.nextLine();
                        System.out.println("Nhập email nhân viên");
                        String email = sc.nextLine();
                        System.out.println("Nhập trình độ nhân viên");
                        String level = sc.nextLine();
                        System.out.println("Nhập chức vụ nhân viên");
                        String position = sc.nextLine();
                        System.out.println("Nhập lương nhân viên");
                        String salary = sc.nextLine();
                        Employee employee = new Employee(id, name,date,gender,cMND,phone,email,level,position,salary);
                        iES.addList(employee);
                        break;
                    case 3:
                        System.out.println("Nhập id cần xóa");
                        String idDelete = sc.nextLine();
                        iES.deleteEmployees(idDelete);
                        break;
                    case 4:
                        System.out.println("Nhập id nhân viên cần sủa thông tin");
                        String idFixed = sc.nextLine();
                        Employee employeeIdFixed = iES.findById(idFixed);
                        if(employeeIdFixed!=null){
                            System.out.println("Nhập tên mới nhân viên");
                            String nameNew = sc.nextLine();
                            System.out.println("Nhập ngày sinh mới nhân viên");
                            String dateNew  = sc.nextLine();
                            System.out.println("Nhập giới tính mới nhân viên");
                            String genderNew = sc.nextLine();
                            System.out.println("Nhập CMND mới nhân viên");
                            String cMNDNew = sc.nextLine();
                            System.out.println("Nhập SĐT mới nhân viên");
                            String phoneNew = sc.nextLine();
                            System.out.println("Nhập email mới nhân viên");
                            String emailNew = sc.nextLine();
                            System.out.println("Nhập trình độ mới nhân viên");
                            String levelNew = sc.nextLine();
                            System.out.println("Nhập chức vụ mới nhân viên");
                            String positionNew = sc.nextLine();
                            System.out.println("Nhập lương mới nhân viên");
                            String salaryNew = sc.nextLine();
                            employeeIdFixed.setName(nameNew);
                            employeeIdFixed.setDate(dateNew);
                            employeeIdFixed.setGender(genderNew);
                            employeeIdFixed.setcMND(cMNDNew);
                            employeeIdFixed.setPhone(phoneNew);
                            employeeIdFixed.setEmail(emailNew);
                            employeeIdFixed.setLevel(levelNew);
                            employeeIdFixed.setPosition(positionNew);
                            employeeIdFixed.setSalary(salaryNew);
                            iES.updateInformation(employeeIdFixed);
                        }else {
                            throw new NotFoundException("Không tìm thấy đối tượng cần tìm");
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.err.println("Nhập lại từ 1 đến 5");
                }
            }catch (NumberFormatException e){
                System.err.println("Nhập lại 1 số");
            }catch (NotFoundException e) {
                e.printStackTrace();
            }
        }while (true);
    }

}
