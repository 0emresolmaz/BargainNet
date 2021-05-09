package Core.Adapter;

import Business.Abstracts.GmailService;
import Entities.Concretes.User;
import GmailAPI.GmailApi;

public class GmailManagerAdapter implements GmailService {
    @Override
    public boolean checkGmail(User user) {
        GmailApi api = new GmailApi();
            return api.checkGmailApi(user);
    }
}
