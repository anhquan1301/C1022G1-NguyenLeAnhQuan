package baitap.quan_li_oto.controller;

import baitap.quan_li_oto.model.model.CarProduct;
import baitap.quan_li_oto.model.service.CarProductServiceIplm;
import baitap.quan_li_oto.model.service.ICarProductService;

import java.util.Scanner;

public class CarProductController {
    private static ICarProductService iCPS = new CarProductServiceIplm();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quản lí danh sách Xe hơi");
        System.out.println("------------------------");
        System.out.println("1.Hiển thị danh sách xe \n" +
                "2.Thêm mới xe vào danh sách \n" +
                "3.Chỉnh sửa thông tin của xe \n" +
                "4.Tìm kiếm theo tên xe\n" +
                "5.Thoát lựa chọn");
        do {
            System.out.println("Nhập lựa chọn của bạn");
            int luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    iCPS.hienThiDanhSachXe();
                    break;
                case 2:
                    System.out.println("Thêm mã xe");
                    String maXe = sc.nextLine();
                    System.out.println("Thêm tên xe");
                    String tenXe = sc.nextLine();
                    System.out.println("Thêm hãng xe");
                    String hangXe = sc.nextLine();
                    System.out.println("Thêm màu xe");
                    String mauXe = sc.nextLine();
                    System.out.println("Thêm giá xe");
                    String giaXe = sc.nextLine();
                    CarProduct carProduct = new CarProduct(maXe,tenXe,hangXe,mauXe,giaXe);
                    iCPS.themMoiXe(carProduct);
                    break;
                case 3:
                    System.out.println("Nhập mã xe cần chỉnh sửa");
                    String maXeChinhSua = sc.nextLine();
                    CarProduct c = iCPS.timKiemMa(maXeChinhSua);
                    if(c!=null){
                        System.out.println("Nhập tên mới của xe");
                        String tenMoi = sc.nextLine();
                        System.out.println("Nhập hãng mới của xe");
                        String hangMoi = sc.nextLine();
                        System.out.println("Nhập màu mới của xe");
                        String mauMoi = sc.nextLine();
                        System.out.println("Nhập giá mới của xe");
                        String giaMoi = sc.nextLine();
                        c.setTenXe(tenMoi);
                        c.setHangXe(hangMoi);
                        c.setMauXe(mauMoi);
                        c.setGiaXe(giaMoi);
                        iCPS.chinhSuaThongTin(c);
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên xe muốn tìm kiếm");
                    String tenCanTim = sc.nextLine();
                    iCPS.timKiemTheoTen(tenCanTim);
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.err.println("Nhập lại lựa chọn từ 1 đến 5");
            }
        }while (true);
    }
}
