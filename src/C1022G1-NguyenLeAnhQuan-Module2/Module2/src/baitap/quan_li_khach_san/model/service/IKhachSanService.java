package baitap.quan_li_khach_san.model.service;

import baitap.quan_li_khach_san.model.model.KhachSan;

public interface IKhachSanService {
    void hienThi();
    void themMoi(KhachSan khachSan);
    KhachSan timKiemMa(String maPhong);
    void timKiemPhong(String tenPhong);
    void thayDoiThongTin(KhachSan khachSan);
}
