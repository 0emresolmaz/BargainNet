package Business.Concretes;

import Business.Abstracts.UserService;
import Business.Abstracts.ValidationService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;


public class UserManager implements UserService {

    private ValidationService validationService;
    private UserDao userDao;

    public UserManager(UserDao userDao, ValidationService validationService) {
        this.userDao = userDao;
        this.validationService = validationService;
    }

    @Override
    public void Register(User user) {
        if (validationService.validate(user)) {
            userDao.register(user);
        }
    }

    @Override
    public void Login(User user) {
        if (validationService.login(user)) {

        }
    }
}
