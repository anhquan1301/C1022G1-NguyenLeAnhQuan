package model;

public class ThucPham {
    int id;
    String ten;
    String ngaySanXuat;
    String ngayHetHan;
    LoaiThucPham loaiThucPham;
    String moTaThem;

    public ThucPham() {
    }

    public ThucPham(int id, String ten, String ngaySanXuat, String ngayHetHan, LoaiThucPham loaiThucPham, String moTaThem) {
        this.id = id;
        this.ten = ten;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.loaiThucPham = loaiThucPham;
        this.moTaThem = moTaThem;
    }

    public ThucPham(String ten, String ngaySanXuat, String ngayHetHan, LoaiThucPham loaiThucPham, String moTaThem) {
        this.ten = ten;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.loaiThucPham = loaiThucPham;
        this.moTaThem = moTaThem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public LoaiThucPham getLoaiThucPham() {
        return loaiThucPham;
    }

    public void setLoaiThucPham(LoaiThucPham loaiThucPham) {
        this.loaiThucPham = loaiThucPham;
    }

    public String getMoTaThem() {
        return moTaThem;
    }

    public void setMoTaThem(String moTaThem) {
        this.moTaThem = moTaThem;
    }
}
