package ss7.bai_tap.Interface_resizeable;

public class Square extends Shape implements IResizeable {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }


    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public void resize(double percent) {
        double area = (edge*edge) + (edge*edge)*percent/100;
        System.out.println("Diện tích hình vuông: " + area);
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }
}
