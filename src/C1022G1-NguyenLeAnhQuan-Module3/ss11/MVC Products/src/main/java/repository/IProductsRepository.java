package repository;

import model.Products;

import java.util.List;

public interface IProductsRepository {
    List<Products> findAll();
    void save(Products products);
    Products findById(int id);
    void update(Products products);
    void delete(Products products);
    Products search(String name);
}
