package ss7.bai_tap.Interface_colorable;

public class HinhChuNhat extends Hinh {
    double chieuRong, chieuCao;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuRong, double chieuCao) {
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    public HinhChuNhat(String color, boolean filled, double chieuRong, double chieuCao) {
        super(color, filled);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getDienTich(){
        return chieuCao*chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuRong=" + chieuRong +
                ", chieuCao=" + chieuCao +
                ", Diệntích=" + getDienTich() +
                '}';
    }
}
