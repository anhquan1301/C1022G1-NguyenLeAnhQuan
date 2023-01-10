package baitap.quan_li_khach_san.controller;

import baitap.quan_li_khach_san.model.model.KhachSan;
import baitap.quan_li_khach_san.model.service.IKhachSanService;
import baitap.quan_li_khach_san.model.service.KhachSanServiceIplm;
import com.sun.javafx.css.parser.Css2Bin;

import java.util.Scanner;

public class KhachSanController {
    private static IKhachSanService iKS = new KhachSanServiceIplm();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quản lí khách sạn");
        System.out.println("-----------------");
        System.out.println("1.Hiển thị danh sách khách sạn \n" +
                "2.Thêm mới phòng \n" +
                "3.Tìm kiếm phòng \n" +
                "4.Thay đổi thông tin của phòng \n" +
                "5.Thoát lựa chọn");
        System.out.println("Nhập lựa chọn của bạn");
        do {
            try{
                int luaChon = Integer.parseInt(sc.nextLine());
                switch (luaChon){
                    case 1:
                        iKS.hienThi();
                        break;
                    case 2:
                        System.out.println("Thêm mã phòng");
                        String maPhong = sc.nextLine();
                        System.out.println("Thêm tên phòng");
                        String tenPhong = sc.nextLine();
                        System.out.println("Thêm diện tích phòng");
                        String dienTich = sc.nextLine();
                        System.out.println("Thêm số lượng người của phòng");
                        String soNguoi = sc.nextLine();
                        System.out.println("Thêm giá phòng");
                        String giaPhong = sc.nextLine();
                        KhachSan khachSan = new KhachSan(maPhong,tenPhong,dienTich,soNguoi,giaPhong);
                        iKS.themMoi(khachSan);
                        break;
                    case 3:
                        System.out.println("Nhập tên phòng cần tìm kiếm");
                        String tenCanTim = sc.nextLine();
                        iKS.timKiemPhong(tenCanTim);
                        break;
                    case 4:
                        System.out.println("Nhập mã phòng cần tìm");
                        String maPhongCanTim = sc.nextLine();
                        KhachSan khachSan1 = iKS.timKiemMa(maPhongCanTim);
                        System.out.println("Nhập tên mới của phòng");
                        String tenMoiPhong = sc.nextLine();
                        System.out.println("Nhập diện tích của phòng");
                        String dienTichMoi = sc.nextLine();
                        System.out.println("Nhập số lượng người của phòng");
                        String soLuongMoi = sc.nextLine();
                        System.out.println("Nhập giá mới của phòng");
                        String giaMoi = sc.nextLine();
                        khachSan1.setTenPhong(tenMoiPhong);
                        khachSan1.setDienTich(dienTichMoi);
                        khachSan1.setSoLuongNguoi(soLuongMoi);
                        khachSan1.setGiaPhong(giaMoi);
                        iKS.thayDoiThongTin(khachSan1);
                        break;
                    case 5:
                        System.exit(1);
                        break;
                    default:
                        System.err.println("Nhập lại lựa chọn từ 1 đến 5");
                }
            }catch (NumberFormatException e){
                System.err.println("Nhập lại 1 số");
            }

        }while (true);
    }
}
