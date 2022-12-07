package ss4.baitap.classfan;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        this(1,false,5,"blue");
    }
    public Fan(int speed,boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
       String str = "";
        if (this.isOn()==true) {
            str += "Fan is on" + "\n";
            str += "Speed: " + this.speed + "\n";
        }
        else {
            str += "Fan is off" + "\n";
        }
        str += "Radius: " + this.radius + "\n";
        str += "Color: " + this.color + "\n";
        return str;
    }
}
