package repository.impl;

import model.User;
import repository.IUserRepository;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserReposiroty implements IUserRepository {

    @Override
    public List<User> display() {
        List<User> userList = new ArrayList<>();
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select * from users");
//            ResultSet resultSet = preparedStatement.executeQuery();
//            User user;
//            while (resultSet.next()) {
//                user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setEmail(resultSet.getString("email"));
//                user.setCountry(resultSet.getString("country"));
//                userList.add(user);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        try {
            CallableStatement callableStatement = BaseRepository.getConnection().prepareCall("call display");
            ResultSet resultSet = callableStatement.executeQuery();
            User user;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public void save(User user) {
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("insert into users (name, email, country) values(?,?,?)");
//            preparedStatement.setString(1, user.getName());
//            preparedStatement.setString(2, user.getEmail());
//            preparedStatement.setString(3, user.getCountry());
//            preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        try {
            CallableStatement callableStatement = BaseRepository.getConnection().prepareCall("call insert_user(?,?,?)");
            callableStatement.setString(1,user.getName());
            callableStatement.setString(2,user.getEmail());
            callableStatement.setString(3,user.getCountry());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public User findById(int id) {
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select * from users where id = ?");
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            User user;
//            while (resultSet.next()) {
//                user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setEmail(resultSet.getString("email"));
//                user.setCountry(resultSet.getString("country"));
//                return user;
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return null;
        try {
            CallableStatement callableStatement = BaseRepository.getConnection().prepareCall("call find_user_by_id (?)");
            callableStatement.setInt(1,id);
            ResultSet resultSet = callableStatement.executeQuery();
            User user;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void edit(User user) {
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection()
//                    .prepareStatement("UPDATE users set name = ?, email = ?, country = ? where id = ?");
//            preparedStatement.setString(1, user.getName());
//            preparedStatement.setString(2, user.getEmail());
//            preparedStatement.setString(3, user.getCountry());
//            preparedStatement.setInt(4, user.getId());
//            preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        try {
            CallableStatement callableStatement = BaseRepository.getConnection().prepareCall("call edit_user(?, ?, ?, ?)");
            callableStatement.setString(1,user.getName());
            callableStatement.setString(2,user.getEmail());
            callableStatement.setString(3,user.getCountry());
            callableStatement.setInt(4,user.getId());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    @Override
    public boolean delete(int id) {
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("delete from users where id = ?");
//            preparedStatement.setInt(1, id);
//            preparedStatement.executeUpdate();
//            return preparedStatement.executeUpdate() > 0;
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return false;
        try {
            CallableStatement callableStatement = BaseRepository.getConnection().prepareCall("call delete_user (?)");
            callableStatement.setInt(1,id);
            callableStatement.executeUpdate();
            return callableStatement.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public List<User>
    search(String country) {
        List<User> userList = new ArrayList<>();
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select * from users where country like concat('%',?,'%')");
//            preparedStatement.setString(1, country);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            User user;
//            while (resultSet.next()) {
//                user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setEmail(resultSet.getString("email"));
//                user.setCountry(resultSet.getString("country"));
//                userList.add(user);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return userList;
        CallableStatement callableStatement = null;
        try {
            callableStatement = BaseRepository.getConnection().prepareCall("call search (?)");
            callableStatement.setString(1,country);
            ResultSet resultSet = callableStatement.executeQuery();
            User user;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public List<User> sort() {
        List<User> userList = new ArrayList<>();
//        try {
//            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select * from users order by name");
//            ResultSet resultSet = preparedStatement.executeQuery();
//            User user;
//            while (resultSet.next()) {
//                user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setEmail(resultSet.getString("email"));
//                user.setCountry(resultSet.getString("country"));
//                userList.add(user);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return userList;
        try {
            CallableStatement callableStatement = BaseRepository.getConnection().prepareCall("call sort");
            ResultSet resultSet = callableStatement.executeQuery();
            User user;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return userList;
    }
}
