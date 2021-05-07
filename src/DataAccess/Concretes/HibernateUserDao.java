package DataAccess.Concretes;

import Business.Constants.Messages;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    public static List<String> mailList = new ArrayList<>();

    @Override
    public void register(User user) {
        System.out.println(Messages.UserRegistered + " " + user.firstName);
    }

    @Override
    public boolean getByMail(String mail) {
        if (mailList.contains(mail)) {
            return true;
        }
        return false;
    }

    @Override
    public List<String> getList() {
        return mailList;
    }
}