package baitap.quan_li_khach_san.model.repo;

import baitap.quan_li_khach_san.model.model.KhachSan;

public interface IKhachSanRepo {
    void hienThi();
    void themMoi(KhachSan khachSan);
    KhachSan timKiemMa(String maPhong);
    void timKiemPhong(String tenPhong);
    void thayDoiThongTin(KhachSan khachSan);
}
