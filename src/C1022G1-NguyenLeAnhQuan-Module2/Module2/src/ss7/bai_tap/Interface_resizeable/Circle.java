package ss7.bai_tap.Interface_resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
      double area = Math.pow(getRadius(),2)*Math.PI + Math.pow(getRadius(),2)*Math.PI*percent/100;
        System.out.println("Diện tích hình tròn: " +area);


    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}
