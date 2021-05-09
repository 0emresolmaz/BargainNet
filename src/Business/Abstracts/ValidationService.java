package Business.Abstracts;

import Entities.Concretes.User;

public interface ValidationService {

    boolean validate(User user);

    boolean login(String mail, String password);
}
