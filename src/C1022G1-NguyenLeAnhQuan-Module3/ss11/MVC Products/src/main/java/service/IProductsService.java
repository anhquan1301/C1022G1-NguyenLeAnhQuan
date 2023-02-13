package service;

import model.Products;

import java.util.List;

public interface IProductsService {
    List<Products> findAll();
    void save(Products products);
    Products findById(int id);
    void update(Products products);
}
