package Case_Study.FuramaResort.model.model;

import java.util.Date;

public abstract class Facility {
    private String name;
    private double area;
    private int price;
    private int maxPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String name, double area, int price, int maxPeople, String typeRent) {
        this.name = name;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
