package ss7.bai_tap.Interface_resizeable;

public class Rectangle extends Shape implements IResizeable {
    private double width;
    private double heigth;

    public Rectangle() {
    }

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public void resize(double percent) {
        double area = width*heigth + width*heigth*percent/100;
        System.out.println( "Diện tích hình chữ nhật: " +area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", heigth=" + heigth +
                '}';
    }
}
