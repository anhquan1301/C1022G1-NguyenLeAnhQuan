package service;

import model.User;

import java.util.List;

public interface IUserService {
    List<User> display();
    void save(User user);
    User findById(int id);
    void edit(User user);
    boolean delete(int id);
    List<User> search(String country);
    List <User> sort();
}
