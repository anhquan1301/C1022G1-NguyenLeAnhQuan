package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer>
    showList(String name);
    Customer findById(int id);
    void edit(Customer customer);
    void save(Customer customer);
    void delete(int id);
}
