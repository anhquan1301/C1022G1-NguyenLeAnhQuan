package repository;

import model.Product;
import model.TypeProduct;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll(String name);
    Product findById(int id);
    void save(Product product);
    void edit(Product product);
    void delete(int id);
    List<TypeProduct> typeProductList();
}
