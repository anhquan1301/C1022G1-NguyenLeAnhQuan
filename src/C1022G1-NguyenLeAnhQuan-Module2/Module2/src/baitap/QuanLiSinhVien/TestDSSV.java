package baitap.QuanLiSinhVien;

import java.util.List;
import java.util.Scanner;

public class TestDSSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        int luaChon = 0;
        System.out.println("---Danh Sách sinh viên---");
        System.out.println("Chọn chức năng sau");
        System.out.println("1. Thêm sinh viên vào danh sách. \n"
                        +  "2. In danh sách sinh viên. \n"
                        +  "3. Kiểm tra sinh viên dựa trên mã sinh viên. \n"
                        +  "4. Thay đổi thông tin sinh viên dựa trên mã sinh viên. \n"
                        +  "5. Xóa 1 sinh viên ra khỏi dánh sách dựa trên mã sinh viên. \n"
                        +  "6. Tìm tất cả sinh viên dựa trên tên được nhập từ bàn phím. \n"
                        +  "7. Xuất danh sách sinh viên có điểm từ cao đến thấp. \n"
                        +  "0. Thoát lựa chọn");
        do {
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    System.out.println("Nhập Mã sinh viên");
                    String maSinhVien = sc.nextLine();
                    System.out.println("Nhập Họ và tên ");
                    String hoVaTen = sc.nextLine();
                    System.out.println("Nhập Điểm trung bình ");
                    float diemTrungBinh = Float.parseFloat(sc.nextLine());
                    SinhVien sinhVien = new SinhVien(maSinhVien,hoVaTen,diemTrungBinh);
                    danhSachSinhVien.themSinhVien(sinhVien);
                    break;
                case 2:
                    danhSachSinhVien.hienThiDSSV();
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên cần tìm");
                    maSinhVien = sc.nextLine();
                    danhSachSinhVien.kiemTraSV(maSinhVien);
                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên cần thay đổi");
                    String maSinhVien1 = sc.nextLine();
                    System.out.println("Nhập Mã sinh viên mới");
                     maSinhVien = sc.nextLine();
                    System.out.println("Nhập Họ và tên mới ");
                    hoVaTen = sc.nextLine();
                    System.out.println("Nhập Điểm mới trung bình ");
                    diemTrungBinh = Float.parseFloat(sc.nextLine());
                    SinhVien sinhvien1 = new SinhVien(maSinhVien,hoVaTen,diemTrungBinh);
                    danhSachSinhVien.thayDoiThongTinSV(maSinhVien1, sinhvien1);
                    break;
                case 5:
                    System.out.println("Nhập mã sinh viên cần xóa");
                    String maSinhvien2 = sc.nextLine();
                    danhSachSinhVien.xoaSinhVien(maSinhvien2);
                    break;
                case 6:
                    System.out.println("Nhập tên cần tìm");
                    String tenSinhvien = sc.nextLine();
                    danhSachSinhVien.timSinhVien(tenSinhvien);
                    break;
                case 7:
                    danhSachSinhVien.sapXepSinhVien();
                    break;
            }

        }while (luaChon!=0);
    }
}
