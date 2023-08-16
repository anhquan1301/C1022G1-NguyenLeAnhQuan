package ss16.bai_tap.quan_li_san_pham.model.model;

public class TypeProduct {
    private Integer id;
    private String name;
    private Object product;
    public TypeProduct() {
    }

    public TypeProduct(Integer id, String name) {
        Product product = new Product();
        this.id = id;
        this.name = name;
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
