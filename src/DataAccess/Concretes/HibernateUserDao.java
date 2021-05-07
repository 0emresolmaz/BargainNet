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
        System.out.println(Messages.UserRegistered + " " + user.firstName);
    }

    @Override
    public List<User> getList() {
        return userlist;
    }
}