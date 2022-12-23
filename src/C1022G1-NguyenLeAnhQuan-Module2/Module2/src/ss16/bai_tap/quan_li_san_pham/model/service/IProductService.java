package ss16.bai_tap.quan_li_san_pham.model.service;

import ss16.bai_tap.quan_li_san_pham.model.model.Product;

public interface IProductService {
    void addProduct(Product product);
    void displayProduct();
    void searchProduct(String name);
}
