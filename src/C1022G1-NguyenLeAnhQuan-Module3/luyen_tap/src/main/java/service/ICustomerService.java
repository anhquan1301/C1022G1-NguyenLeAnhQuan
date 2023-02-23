package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> showList(String name);
    Customer findById(int id);
    void edit(Customer customer);
    void save(Customer customer);
    void delete(int id);
}
