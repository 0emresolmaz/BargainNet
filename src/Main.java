import Business.Abstracts.UserService;
import Business.Concretes.UserManager;
import Business.Concretes.ValidationManager;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserManager(new HibernateUserDao(), new ValidationManager());

        User user1 = new User(1, "E", "Solmaz", "emre.solmaz106@gmail.com", "135790", LocalDate.of(1989, 5, 27));

        User user2 = new User(2, "Emre", "Solmaz", "emre.solmaz106@gmail.com", "13579012", LocalDate.of(1989, 5, 27));

        User user3 = new User(3, "Emre3", "Solmaz", "emre.solmaz106@gmail.com", "13579012", LocalDate.of(1989, 5, 27));

        User[] users = new User[]{user1, user2, user3};

        for (User user : users) {
            userService.Register(user);
        }
    }
}