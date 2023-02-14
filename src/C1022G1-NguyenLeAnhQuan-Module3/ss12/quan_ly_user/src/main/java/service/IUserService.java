package service;

import model.User;

import java.util.List;

public interface IUserService {
    List<User> display();
    void save(User user);
    User findById(int id);
    void edit(User user);
}
