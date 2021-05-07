package DataAccess.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface UserDao {

    void register(User user);

    boolean getByMail(String mail);

    List<String> getList();

}
