package ss11.bai_tap.mo_hinh_MVC.model.service;

import ss11.bai_tap.mo_hinh_MVC.model.model.Product;
import ss11.bai_tap.mo_hinh_MVC.model.repository.IProductRepository;
import ss11.bai_tap.mo_hinh_MVC.model.repository.ProductRepository;

public class ProductService implements IProductService{
    private IProductRepository repository = new ProductRepository();

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void displayProduct() {
        repository.displayProduct();
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void updateProduct(Product product) {
        repository.updateProduct(product);
    }


    @Override
    public void removeProduct(int id) {
        repository.removeProduct(id);
    }

    @Override
    public void searchProduct(String name) {
        repository.searchProduct(name);
    }

    @Override
    public void sortAscending() {
        repository.sortAscending();
    }

    @Override
    public void sortDescending() {
        repository.sortDescending();
    }
}
