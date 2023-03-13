package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
}
