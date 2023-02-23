package service.iplm;

import model.Product;
import model.TypeProduct;
import repository.IProductRepository;
import repository.iplm.ProductRepository;
import service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> findAll(String name) {
        if(name==null){
            name="";
        }
        return iProductRepository.findAll(name);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void edit(Product product) {
        iProductRepository.edit(product);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }

    @Override
    public List<TypeProduct> typeProductList() {
        return iProductRepository.typeProductList();
    }
}
