package baitap.quan_li_oto.model.service;

import baitap.quan_li_oto.model.model.CarProduct;
import baitap.quan_li_oto.model.repository.CarProductRepoIplm;
import baitap.quan_li_oto.model.repository.ICarProductRepo;

public class CarProductServiceIplm implements ICarProductService{
    private static ICarProductRepo iCPR = new CarProductRepoIplm();
    @Override
    public void hienThiDanhSachXe() {
        iCPR.hienThiDanhSachXe();
    }

    @Override
    public void themMoiXe(CarProduct carProduct) {
        iCPR.themMoiXe(carProduct);
    }

    @Override
    public void timKiemTheoTen(String name) {
        iCPR.timKiemTheoTen(name);
    }

    @Override
    public CarProduct timKiemMa(String maXe) {
        return iCPR.timKiemMa(maXe);
    }

    @Override
    public void chinhSuaThongTin(CarProduct carProduct) {
        iCPR.chinhSuaThongTin(carProduct);
    }
}
