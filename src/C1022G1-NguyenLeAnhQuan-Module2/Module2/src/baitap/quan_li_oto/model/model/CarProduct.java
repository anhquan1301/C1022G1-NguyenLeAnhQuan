package baitap.quan_li_oto.model.model;

public class CarProduct {
    private String maXe;
    private String tenXe;
    private String hangXe;
    private String mauXe;
    private String giaXe;

    public CarProduct() {
    }

    public CarProduct(String maXe, String tenXe, String hangXe, String mauXe, String giaXe) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.mauXe = mauXe;
        this.giaXe = giaXe;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(String giaXe) {
        this.giaXe = giaXe;
    }

    @Override
    public String toString() {
        return "CarProduct{" +
                "maXe='" + maXe + '\'' +
                ", tenXe='" + tenXe + '\'' +
                ", hangXe='" + hangXe + '\'' +
                ", mauXe='" + mauXe + '\'' +
                ", giaXe='" + giaXe + '\'' +
                '}';
    }

    public String formatCSV(){
        final String COMMA = ",";
        return this.maXe+COMMA+this.tenXe+COMMA+this.hangXe+COMMA+this.mauXe+COMMA+this.giaXe;
    }
}
