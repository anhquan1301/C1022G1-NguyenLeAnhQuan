package baitap.quan_li_khach_san.model.model;

public class KhachSan {
    private String maPhong;
    private String tenPhong;
    private String dienTich;
    private String soLuongNguoi;
    private String giaPhong;

    public KhachSan() {
    }

    public KhachSan(String maPhong, String tenPhong, String dienTich, String soLuongNguoi, String giaPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.soLuongNguoi = soLuongNguoi;
        this.giaPhong = giaPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    public String getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(String soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(String giaPhong) {
        this.giaPhong = giaPhong;
    }

    @Override
    public String toString() {
        return "KhachSan{" +
                "maPhong='" + maPhong + '\'' +
                ", tenPhong='" + tenPhong + '\'' +
                ", dienTich='" + dienTich + '\'' +
                ", soLuongNguoi='" + soLuongNguoi + '\'' +
                ", giaPhong='" + giaPhong + '\'' +
                '}';
    }
    public String formatCSV(){
        return this.maPhong+","+this.tenPhong+","+this.dienTich+","+this.soLuongNguoi+","+this.giaPhong;
    }
}
