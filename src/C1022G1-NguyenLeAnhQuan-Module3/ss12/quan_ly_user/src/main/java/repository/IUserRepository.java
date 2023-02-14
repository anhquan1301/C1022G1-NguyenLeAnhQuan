package repository;

import model.User;

import java.util.List;

public interface IUserRepository {
    List<User> display();
    void save(User user);
    User findById(int id);
    void edit(User user);
    boolean delete(int id);
}
