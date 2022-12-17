package ss11.bai_tap.mo_hinh_MVC.model.repository;

import ss11.bai_tap.mo_hinh_MVC.model.model.Product;

public interface IProductRepository {
    void addProduct(Product product);

    void displayProduct();

    void updateProduct(int id, Product product);

    void removeProduct(int id);

    void searchProduct(String name);

    void sortAscending();

    void sortDescending();

}
