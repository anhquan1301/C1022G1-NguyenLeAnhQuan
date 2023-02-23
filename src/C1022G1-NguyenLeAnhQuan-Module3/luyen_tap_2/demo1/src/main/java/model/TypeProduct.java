package model;

public class TypeProduct {
    int idTypeProduct;
    String nameTypeProduct;

    public TypeProduct() {
    }

    public TypeProduct(int idTypeProduct, String nameTypeProduct) {
        this.idTypeProduct = idTypeProduct;
        this.nameTypeProduct = nameTypeProduct;
    }

    public TypeProduct(String tProduc) {
        this.nameTypeProduct = tProduc;
    }

    public TypeProduct(int idTypeProduct) {
        this.idTypeProduct = idTypeProduct;
    }

    public int getIdTypeProduct() {
        return idTypeProduct;
    }

    public void setIdTypeProduct(int idTypeProduct) {
        this.idTypeProduct = idTypeProduct;
    }

    public String getNameTypeProduct() {
        return nameTypeProduct;
    }

    public void setNameTypeProduct(String nameTypeProduct) {
        this.nameTypeProduct = nameTypeProduct;
    }
}
