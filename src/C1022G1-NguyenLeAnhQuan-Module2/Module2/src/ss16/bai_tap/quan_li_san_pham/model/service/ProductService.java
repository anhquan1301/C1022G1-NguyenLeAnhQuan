package ss16.bai_tap.quan_li_san_pham.model.service;

import ss16.bai_tap.quan_li_san_pham.model.model.Product;
import ss16.bai_tap.quan_li_san_pham.model.repository.IProductRepository;
import ss16.bai_tap.quan_li_san_pham.model.repository.ProductRepository;

public class ProductService implements IProductService {
   private static IProductRepository repository = new ProductRepository();
    @Override
    public void addProduct(Product product) {
       repository.addProduct(product);
    }

    @Override
    public void displayProduct() {
       repository.displayProduct();
    }

    @Override
    public void searchProduct(String name) {
       repository.searchProduct(name);
    }
}
