package Business.Abstracts;

import Entities.Concretes.User;

public interface UserService {

    void Register(User user);

    void Login(String mail, String password);
}