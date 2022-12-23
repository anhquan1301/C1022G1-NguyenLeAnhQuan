package ss16.bai_tap.quan_li_san_pham.model.repository;

import ss16.bai_tap.quan_li_san_pham.model.model.Product;
import ss16.bai_tap.quan_li_san_pham.ulti.ProductFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static List<Product> productList = new ArrayList<>();
    static {
        Product product1 = new Product(1, "S450", "Mercesdes", "Black", 200000 );
        Product product2 = new Product(2, "CX5", "Mazda", "White", 50000 );
        Product product3 = new Product(3, "CRV", "Honda", "Red", 40000 );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }
    @Override
    public void addProduct(Product product) {
            productList.add(product);
        ProductFile.writeListFile(productList);
    }
    @Override
    public void displayProduct() {
        List<Product> result = ProductFile.readListFile();
        for (Product product : result){
            System.out.println(product);
        }
    }
    @Override
    public void searchProduct(String name) {
        List<Product> result = ProductFile.readListFile();
        for (Product product: result){
            if(product.getName().contains(name)){
                System.out.println("Thông tin sản phẩm: " + product);
            }
        }
    }
}
