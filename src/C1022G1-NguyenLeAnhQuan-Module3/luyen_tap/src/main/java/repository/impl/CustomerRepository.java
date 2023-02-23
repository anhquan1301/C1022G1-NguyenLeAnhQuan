package repository.impl;

import model.Customer;
import repository.ICustomerRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    @Override
    public List<Customer> showList(String name) {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select c.id_customer, c.name_customer, c.email_customer, c.country_customer, t.name_type_customer from customer c join type_customer t on t.id_type_customer = c.id_type_customer where c.name_customer like concat('%',?,'%')");
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()){
                customer = new Customer();
                customer.setId(resultSet.getInt("c.id_customer"));
                customer.setName(resultSet.getString("c.name_customer"));
                customer.setEmail(resultSet.getString("c.email_customer"));
                customer.setCountry(resultSet.getString("c.country_customer"));
                customer.setTypeSong(resultSet.getString("t.name_type_customer"));
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public Customer findById(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select * from customer where id_customer = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()){
                customer = new Customer();
                customer.setId(resultSet.getInt("id_customer"));
                customer.setName(resultSet.getString("name_customer"));
                customer.setEmail(resultSet.getString("email_customer"));
                customer.setCountry(resultSet.getString("country_customer"));
                customer.setTypeSong(resultSet.getString("id_type_customer"));
                return customer;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void edit(Customer customer) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("update customer set name_customer = ?,email_customer = ?,country_customer = ?,id_type_customer = ? where id_customer = ?");
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getEmail());
            preparedStatement.setString(3,customer.getCountry());
            preparedStatement.setString(4,customer.getTypeSong());
            preparedStatement.setInt(5,customer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void save(Customer customer) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("insert into customer (name_customer,email_customer,country_customer,id_type_customer) values (?,?,?,?)");
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getEmail());
            preparedStatement.setString(3,customer.getCountry());
            preparedStatement.setString(4,customer.getTypeSong());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("delete from customer where id_customer = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
