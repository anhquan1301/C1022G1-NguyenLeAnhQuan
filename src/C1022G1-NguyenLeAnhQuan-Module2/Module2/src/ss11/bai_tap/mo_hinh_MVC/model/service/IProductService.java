package ss11.bai_tap.mo_hinh_MVC.model.service;

import ss11.bai_tap.mo_hinh_MVC.model.model.Product;

public interface IProductService {
    void addProduct(Product product);

    void displayProduct();

    Product findById(int id);

    void updateProduct( Product product);

    void removeProduct(int id);

    void searchProduct(String name);

    void sortAscending();

    void sortDescending();

}
