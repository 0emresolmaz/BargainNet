package GmailAPI;

import Entities.Concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailApi {

    public boolean checkGmailApi(User user) {
        Pattern pattern = Pattern.compile("^(.+)@gmail(.+)$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(user.mail);
        if (!matcher.matches()) {
            return false;
        }
        return true;
    }
}

