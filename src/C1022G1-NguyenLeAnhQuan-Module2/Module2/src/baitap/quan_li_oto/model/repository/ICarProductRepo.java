package baitap.quan_li_oto.model.repository;

import baitap.quan_li_oto.model.model.CarProduct;

public interface ICarProductRepo {
    void hienThiDanhSachXe();
    void themMoiXe(CarProduct carProduct);
    void timKiemTheoTen(String name);
    CarProduct timKiemMa(String maXe);
    void chinhSuaThongTin(CarProduct carProduct);
}
