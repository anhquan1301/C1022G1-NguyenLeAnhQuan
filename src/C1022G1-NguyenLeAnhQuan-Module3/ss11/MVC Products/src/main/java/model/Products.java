package model;

public class Products {
    private int id;
    private String name;
    private String price;
    private String decription;
    private String producer;

    public Products() {
    }

    public Products(int id, String name, String price, String decription, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.decription = decription;
        this.producer = producer;
    }

    public Products(String name, String price, String decription, String producer) {
        this.name = name;
        this.price = price;
        this.decription = decription;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
