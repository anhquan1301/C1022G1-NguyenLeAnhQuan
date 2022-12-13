package ss7.bai_tap.Interface_colorable;

public abstract class Hinh implements IColorable {
    private String color;
    private boolean filled;

    public Hinh() {
    }

    public Hinh(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    @Override
    public String toString() {
        return "Hinh{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    @Override
    public void howToColor() {

    }
}
