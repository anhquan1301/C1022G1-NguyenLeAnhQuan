package baitap.quan_li_khach_san.model.repo;

import baitap.quan_li_khach_san.model.model.KhachSan;
import baitap.quan_li_khach_san.util.IOKhachSan;

import java.util.ArrayList;
import java.util.List;

public class KhachSanRepoIplm implements IKhachSanRepo {
  private static List<KhachSan> khachSanList = new ArrayList<>();

    @Override
    public void hienThi() {
        khachSanList = IOKhachSan.readFile();
        for (KhachSan khachSan : khachSanList){
            System.out.println(khachSan);
        }
    }

    @Override
    public void themMoi(KhachSan khachSan) {
        khachSanList.clear();
        khachSanList.add(khachSan);
        IOKhachSan.writeFile2(khachSanList);
    }

    @Override
    public KhachSan timKiemMa(String maPhong) {
        khachSanList= IOKhachSan.readFile();
        for (int i = 0; i <khachSanList.size() ; i++) {
            if(khachSanList.get(i).getMaPhong().equals(maPhong)){
                return khachSanList.get(i);
            }
        }
        return null;
    }

    @Override
    public void timKiemPhong(String tenPhong) {
        khachSanList = IOKhachSan.readFile();
        for (KhachSan khachSan : khachSanList){
            if(khachSan.getTenPhong().contains(tenPhong))
            System.out.println(khachSan);
        }
    }

    @Override
    public void thayDoiThongTin(KhachSan khachSan) {
        khachSanList = IOKhachSan.readFile();
        for (int i =0;i<khachSanList.size();i++){
            if(khachSanList.get(i).getMaPhong().equals(khachSan.getMaPhong())){
                khachSanList.set(i,khachSan);
                IOKhachSan.writeFile(khachSanList);
            }
        }
    }
}
