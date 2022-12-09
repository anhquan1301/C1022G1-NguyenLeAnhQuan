package ss6.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double heigth;

    public Cylinder(){

    }
    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getVolume(){
        return getArea()*getHeigth();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", color=" + getColor() +
                ", area=" + getArea() +
                ", heigth=" + heigth +
                ", volume=" + getVolume() +
                '}';
    }
}
