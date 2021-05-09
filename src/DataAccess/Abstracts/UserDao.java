package DataAccess.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface UserDao {

    void register(User user);
    void login(User user);
    List<User> getList();

}
