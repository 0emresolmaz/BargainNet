package Business.Abstracts;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public interface ValidationService {

    boolean validate(User user);
    boolean login(User user);
}
