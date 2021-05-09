import Business.Abstracts.UserService;
import Business.Concretes.UserManager;
import Business.Concretes.ValidationManager;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n---------------------Register işlemleri--------------------------------");

        UserService userService = new UserManager(new HibernateUserDao(), new ValidationManager(new HibernateUserDao()));

        User user1 = new User(1, "A", "B", "abcoutlook.com", "135", LocalDate.of(1989, 5, 27));

        User user2 = new User(2, "Emre", "Solmaz", "emre.solmaz106@gmail.com", "13579012", LocalDate.of(1989, 5, 27));

        User user3 = new User(3, "Emre3", "Solmaz", "emre.solmaz106@gmail.com", "1", LocalDate.of(1989, 5, 27));

        User user4 = new User(4, "Arda", "Turan", "ardaturan@gs.com", "ardags10", LocalDate.of(1986, 1, 1));

        User user5 = new User(5, "Ozan", "Tufan", "ozan@fb.com", "ot7", LocalDate.of(1985, 1, 1));

        User[] users = {user1, user2, user3, user4, user5};
        for (User user : users) {
            userService.Register(user);
        }

        System.out.println("\n---------------------Login işlemleri--------------------------------");
        String mail1 = "emre.solmaz106@gmail.com";
        String password1 = "270589";
        userService.Login(mail1, password1);

        String mail2 = "emre.solmaz106@gmail.com";
        String password2 = "13579012";
        userService.Login(mail2, password2);
    }
}