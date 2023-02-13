package repository.iplm;

import model.Products;
import repository.IProductsRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductsRepository implements IProductsRepository {
   private static List<Products> productsList = new ArrayList<>();
    static {
        productsList.add(new Products(1,"Iphone13","1000","100%","Apple"));
        productsList.add(new Products(2,"Iphone12","700","100%","Apple"));
        productsList.add(new Products(3,"Iphone11","300","98%","Apple"));
    }

    @Override
    public List<Products> findAll() {
        return productsList;
    }

    @Override
    public void save(Products products) {
        products.setId(productsList.size()+1);
        productsList.add(products);
    }

    @Override
    public Products findById(int id) {
        for (int i = 0; i <productsList.size() ; i++) {
            if(productsList.get(i).getId()==id){
                return productsList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(Products products) {
        for (int i = 0; i <productsList.size() ; i++) {
            if(productsList.get(i).getId()==products.getId()){
                productsList.set(i,products);
            }
        }
    }

    @Override
    public void delete(Products products) {
        for (int i = 0; i <productsList.size() ; i++) {
            if(productsList.get(i).getId()==products.getId()){
                productsList.remove(productsList.get(i));
            }
        }
    }

    @Override
    public Products search(String name) {
        for (int i = 0; i <productsList.size() ; i++) {
            if (productsList.get(i).getName().contains(name)){
                return productsList.get(i);
            }
        }
        return null;
    }
}
