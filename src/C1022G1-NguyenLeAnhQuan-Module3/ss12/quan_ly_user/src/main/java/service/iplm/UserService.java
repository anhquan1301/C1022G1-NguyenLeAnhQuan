package service.iplm;

import model.User;
import repository.IUserRepository;
import repository.iplm.UserReposiroty;
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
}
