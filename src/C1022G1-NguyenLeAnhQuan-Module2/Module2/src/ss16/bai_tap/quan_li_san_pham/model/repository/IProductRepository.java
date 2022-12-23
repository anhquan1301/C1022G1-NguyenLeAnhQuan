package ss16.bai_tap.quan_li_san_pham.model.repository;

import ss16.bai_tap.quan_li_san_pham.model.model.Product;

public interface IProductRepository {
    void addProduct(Product product);
    void displayProduct();
    void searchProduct(String name);
}
