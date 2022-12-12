package ss7.bai_tap.Interface_colorable;

public class HinhVuong extends Hinh implements Colorable{
    double canh;


    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public HinhVuong(String color, boolean filled, double canh) {
        super(color, filled);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double getDienTich(){
        return canh*canh;
    }

    @Override
    public void howToColor() {
        if(super.isFilled()){
            System.out.println("Color all four sides " + getColor());
        }else {
            System.out.println("Not fill color");
        }
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                ", Diệntích=" + getDienTich() +
                '}';
    }
}
