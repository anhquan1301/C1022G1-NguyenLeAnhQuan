package ss7.bai_tap.Interface_colorable;

public class HinhTron extends Hinh implements Colorable {
    private double banKinh;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(String color, boolean filled, double banKinh) {
        super(color, filled);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getDienTich(){
        return Math.pow(getBanKinh(),2);
    }

    @Override
    public void howToColor() {
        if(super.isFilled()){
            System.out.println("Color all sides " + getColor());
        }
        else {
            System.out.println("Not fill color");
        }
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                ", Diệntích=" + getDienTich() +
                '}';
    }
}
