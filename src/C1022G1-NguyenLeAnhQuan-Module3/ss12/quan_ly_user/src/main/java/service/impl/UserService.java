package service.impl;

import model.User;
import repository.IUserRepository;
import repository.impl.UserReposiroty;
import service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    private IUserRepository iUserRepository = new UserReposiroty();

    @Override
    public List<User> display() {
        return iUserRepository.display();
    }

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }

    @Override
    public User findById(int id) {
        return iUserRepository.findById(id);
    }

    @Override
    public void edit(User user) {
        iUserRepository.edit(user);
    }

    @Override
    public boolean delete(int id) {
       return iUserRepository.delete(id);
    }

    @Override
    public List<User> search(String country) {
       return iUserRepository.search(country);
    }

    @Override
    public List<User> sort() {
        return iUserRepository.sort();
    }
}
