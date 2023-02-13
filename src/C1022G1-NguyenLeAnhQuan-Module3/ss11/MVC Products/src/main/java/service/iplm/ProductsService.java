package service.iplm;

import model.Products;
import repository.IProductsRepository;
import repository.iplm.ProductsRepository;
import service.IProductsService;

import java.util.List;

public class ProductsService implements IProductsService {
    private IProductsRepository iProductsRepository = new ProductsRepository();

    @Override
    public List<Products> findAll() {
        return iProductsRepository.findAll();
    }

    @Override
    public void save(Products products) {
        iProductsRepository.save(products);
    }

    @Override
    public Products findById(int id) {
        return iProductsRepository.findById(id);
    }

    @Override
    public void update(Products products) {
        iProductsRepository.update(products);
    }

    @Override
    public void delete(Products products) {
        iProductsRepository.delete(products);
    }

    @Override
    public Products search(String name) {
        return iProductsRepository.search(name);
    }

}
