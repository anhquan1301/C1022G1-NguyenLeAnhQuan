package ss16.bai_tap.quan_li_san_pham.model.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 2l;
    private int id;
    private String name;
    private String producer;
    private String color;
    private int price;

    public Product() {
    }

    public Product(int id, String name, String producer, String color, int price) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.color = color;
        this.price = price;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
