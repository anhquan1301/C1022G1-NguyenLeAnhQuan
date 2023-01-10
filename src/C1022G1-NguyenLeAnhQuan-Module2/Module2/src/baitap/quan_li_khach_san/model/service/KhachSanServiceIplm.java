package baitap.quan_li_khach_san.model.service;

import baitap.quan_li_khach_san.model.model.KhachSan;
import baitap.quan_li_khach_san.model.repo.IKhachSanRepo;
import baitap.quan_li_khach_san.model.repo.KhachSanRepoIplm;

public class KhachSanServiceIplm  implements IKhachSanService{
    private static IKhachSanRepo iKSR = new KhachSanRepoIplm();
    @Override
    public void hienThi() {
        iKSR.hienThi();
    }

    @Override
    public void themMoi(KhachSan khachSan) {
        iKSR.themMoi(khachSan);
    }

    @Override
    public KhachSan timKiemMa(String maPhong) {
        return iKSR.timKiemMa(maPhong);
    }

    @Override
    public void timKiemPhong(String tenPhong) {
        iKSR.timKiemPhong(tenPhong);
    }

    @Override
    public void thayDoiThongTin(KhachSan khachSan) {
        iKSR.thayDoiThongTin(khachSan);
    }
}
