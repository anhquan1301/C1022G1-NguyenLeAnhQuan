package baitap.quan_li_san_pham.model.model;

public class IPProduct {
    private String codeProduct;
    private String nameProduct;
    private String color;
    private String typePhone;
    private String price;

    public IPProduct() {
    }

    public IPProduct(String codeProduct, String nameProduct, String color, String typePhone, String price) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.color = color;
        this.typePhone = typePhone;
        this.price = price;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypePhone() {
        return typePhone;
    }

    public void setTypePhone(String typePhone) {
        this.typePhone = typePhone;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "IPProduct{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", color='" + color + '\'' +
                ", typePhone='" + typePhone + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
    public String formatCSV(){
        final String COMMA = ",";
        return this.codeProduct+COMMA+this.nameProduct+COMMA+this.color+COMMA+this.typePhone+COMMA+this.price;
    }
}
