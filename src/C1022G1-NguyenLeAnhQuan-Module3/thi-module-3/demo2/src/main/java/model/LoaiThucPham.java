package model;

public class LoaiThucPham {
    int idLoaiThucPham;
    String tenLoaiThucPham;

    public LoaiThucPham() {
    }

    public LoaiThucPham(int idLoaiThucPham, String tenLoaiThucPham) {
        this.idLoaiThucPham = idLoaiThucPham;
        this.tenLoaiThucPham = tenLoaiThucPham;
    }

    public LoaiThucPham(String tenLoaiThucPham) {
        this.tenLoaiThucPham = tenLoaiThucPham;
    }

    public LoaiThucPham(int idLoaiThucPham) {
        this.idLoaiThucPham = idLoaiThucPham;
    }

    public int getIdLoaiThucPham() {
        return idLoaiThucPham;
    }

    public void setIdLoaiThucPham(int idLoaiThucPham) {
        this.idLoaiThucPham = idLoaiThucPham;
    }

    public String getTenLoaiThucPham() {
        return tenLoaiThucPham;
    }

    public void setTenLoaiThucPham(String tenLoaiThucPham) {
        this.tenLoaiThucPham = tenLoaiThucPham;
    }
}
