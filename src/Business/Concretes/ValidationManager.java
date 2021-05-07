package Business.Concretes;

import Business.Abstracts.ValidationService;
import Business.Constants.Messages;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationManager implements ValidationService {
    HibernateUserDao dao = new HibernateUserDao();

    @Override
    public boolean validate(User user) {
        if (rules(user) & isRegistered(user)) {
            dao.getList().add(user);
            return true;
        }
        return false;
    }

    private boolean rules(User user) {
        if (isFirstName(user.firstName) & isLastName(user.lastName) & isPassword(user.password) & isEmailFormat(user.mail)) {
            return true;
        }
        return false;
    }

    private boolean isEmailFormat(String mail) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        if (!matcher.matches()) {
            System.out.println(Messages.ErrorEmailFormat + " : " + mail);
            return false;
        }
        return true;
    }

    private boolean isFirstName(String firstName) {
        if (firstName.length() < 2) {
            System.out.println(Messages.ErrorFirstName + " : " + firstName);
            return false;
        }
        return true;
    }

    private boolean isLastName(String lastName) {
        if (lastName.length() < 2) {
            System.out.println(Messages.ErrorLastName + " : " + lastName);
            return false;
        }
        return true;
    }

    private boolean isPassword(String password) {
        if (password.length() < 6) {
            System.out.println(Messages.ErrorPassword + " : " + password);
            return false;
        }
        return true;
    }

    private boolean isRegistered(User user) {

        for (User myUser : dao.getList()) {
            if (myUser.mail.equals(user.mail)) {
                System.out.println(Messages.emailIsAlreadyRegistered + " : " + user.mail);
                return false;
            }
        }
        return true;
    }
}
