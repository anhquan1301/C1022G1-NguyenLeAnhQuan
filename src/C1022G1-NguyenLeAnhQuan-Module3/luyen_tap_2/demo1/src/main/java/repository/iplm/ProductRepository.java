package repository.iplm;

import model.Product;
import model.TypeProduct;
import repository.BaseRepository;
import repository.IProductRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> findAll(String name) {
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select p.id, p.name,p.price,t.name_type_product from product p join type_product t on p.id_type_product = t.id_type_product where p.name like concat('%',?,'%')");
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product;
            while (resultSet.next()){
                product = new Product();
                product.setId(resultSet.getInt("p.id"));
                product.setName(resultSet.getString("p.name"));
                product.setPrice(resultSet.getInt("p.price"));
                String tProduc = resultSet.getString("t.name_type_product");
                TypeProduct typeProduct = new TypeProduct(tProduc);
                product.setTypeProduct(typeProduct);
                productList.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    @Override
    public Product findById(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select p.id, p.name,p.price,t.name_type_product from product p join type_product t on p.id_type_product = t.id_type_product where p.id=?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product;
            while (resultSet.next()){
                product = new Product();
                product.setId(resultSet.getInt("p.id"));
                product.setName(resultSet.getString("p.name"));
                product.setPrice(resultSet.getInt("p.price"));
                String tProduc = resultSet.getString("t.name_type_product");
                TypeProduct typeProduct = new TypeProduct(tProduc);
                product.setTypeProduct(typeProduct);
                return product;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void save(Product product) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("insert into product(name,price,id_type_product) values(?,?,?)");
            preparedStatement.setString(1,product.getName());
            preparedStatement.setInt(2,product.getPrice());
            preparedStatement.setInt(3,product.getTypeProduct().getIdTypeProduct());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void edit(Product product) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("update product set name=?,price=?,id_type_product=? where id=?");
            preparedStatement.setString(1,product.getName());
            preparedStatement.setInt(2,product.getPrice());
            preparedStatement.setInt(3,product.getTypeProduct().getIdTypeProduct());
            preparedStatement.setInt(4,product.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("delete from product where id = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<TypeProduct> typeProductList() {
        List<TypeProduct> typeProductList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select * from type_product");
            ResultSet resultSet = preparedStatement.executeQuery();
            TypeProduct typeProduct;
            while (resultSet.next()){
                typeProduct = new TypeProduct();
                typeProduct.setIdTypeProduct(resultSet.getInt("id_type_product"));
                typeProduct.setNameTypeProduct(resultSet.getString("name_type_product"));
                typeProductList.add(typeProduct);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return typeProductList;
    }
}
