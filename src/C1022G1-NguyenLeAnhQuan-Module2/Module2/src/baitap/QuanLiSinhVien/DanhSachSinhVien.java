package baitap.QuanLiSinhVien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DanhSachSinhVien {
    private List<SinhVien> dssv = new ArrayList<>();
    SinhVien sinhVien3 = new SinhVien("03", "Trần Văn B", 8);
    SinhVien sinhVien1 = new SinhVien("01", "Nguyễn Lê Anh Quân", 10);
    SinhVien sinhVien2 = new SinhVien("02", "Nguyễn Văn A", 9);

    public DanhSachSinhVien() {
        dssv.add(sinhVien3);
        dssv.add(sinhVien1);
        dssv.add(sinhVien2);
    }

    public DanhSachSinhVien(List<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public void themSinhVien(SinhVien sv){
        dssv.add(sv);
    }

    public void hienThiDSSV(){
        for (SinhVien sinhvien: dssv) {
            System.out.println(sinhvien);
        }
    }

    public void kiemTraSV(String maSinhVien){
         for (int i = 0; i <dssv.size() ; i++) {
           if (dssv.get(i).getMaSinhVien().equals(maSinhVien)){
               System.out.println(dssv.get(i));
           }
        }
    }
    public void thayDoiThongTinSV(String maSinhVien, SinhVien sinhVien){
        for (int i = 0; i <dssv.size() ; i++) {
            if (dssv.get(i).getMaSinhVien().equals(maSinhVien)){
                dssv.set(dssv.indexOf(dssv.get(i)),sinhVien);
            }
//            System.out.println(dssv.get(i));
        }
    }
    public void xoaSinhVien(String maSinhVien){
        for (int i = 0; i <dssv.size() ; i++) {
            if (dssv.get(i).getMaSinhVien().equals(maSinhVien)){
                dssv.remove(dssv.get(i));
            }
        }
    }
    public void timSinhVien(String ten){
        for(SinhVien sinhVien : dssv){
            if (sinhVien.getHoVaTen().indexOf(ten)!= -1){
                System.out.println(sinhVien);
            }
        }
    }
    public void sapXepSinhVien(){
        Collections.sort(dssv);
    }

}
