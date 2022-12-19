package baitap.QuanLiSinhVien;

public class SinhVien implements Comparable<SinhVien> {
    private String maSinhVien;
    private String hoVaTen;
    private float diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoVaTen, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }


    @Override
    public int compareTo(SinhVien o) {
        return (int) (o.getDiemTrungBinh()-this.getDiemTrungBinh());
    }
}
