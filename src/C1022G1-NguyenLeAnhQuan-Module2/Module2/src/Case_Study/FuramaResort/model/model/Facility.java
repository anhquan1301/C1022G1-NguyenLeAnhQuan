package Case_Study.FuramaResort.model.model;

import java.util.Date;

public abstract class Facility {
    private String serviceCode;
    private String name;
    private String area;
    private String price;
    private String maxPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String serviceCode, String name, String area, String price, String maxPeople, String typeRent) {
        this.serviceCode = serviceCode;
        this.name = name;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
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
        return ", serviceCode='" + serviceCode + '\'' +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", price='" + price + '\'' +
                ", maxPeople='" + maxPeople + '\'' +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
