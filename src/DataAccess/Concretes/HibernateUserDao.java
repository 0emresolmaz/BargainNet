package DataAccess.Concretes;

import Business.Constants.Messages;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    public static List<User> userlist = new ArrayList<>();

    @Override
    public void register(User user) {
        System.out.println("" + Messages.UserRegistered + " : " + user.firstName + " " + user.lastName + "\n");
    }

    @Override
    public void login(User user) {
        System.out.println(Messages.SuccessLogin + " : " + user.firstName + " " + user.lastName);
    }

    @Override
    public List<User> getList() {
        return userlist;
    }
}