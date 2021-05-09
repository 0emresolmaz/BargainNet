package Business.Concretes;

import Business.Abstracts.UserService;
import Business.Abstracts.ValidationService;
import Business.Constants.Messages;
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
    public void Login(String mail, String password) {
        if (validationService.login(mail, password)) {
            System.out.println("Sisteme giriş yapıldı: "+mail);
        } else {
            System.out.println("Yanlış kullanıcı bilgisi, sisteme giriş yapılamadı");
        }
    }
}
