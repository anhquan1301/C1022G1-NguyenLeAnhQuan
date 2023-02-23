package model;

public class Product {
    int id;
    String name;
    int price;
    TypeProduct typeProduct;

    public Product() {
    }

    public Product(int id, String name, int price, TypeProduct typeProduct) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.typeProduct = typeProduct;
    }

    public Product(String name, int price, TypeProduct typeProduct) {
        this.name = name;
        this.price = price;
        this.typeProduct = typeProduct;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }
}
