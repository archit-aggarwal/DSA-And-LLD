package services;

import models.Dao;
import models.User;

public class UserService {
    Dao users;

    public UserService() {
        users = Dao.getInstance();
    }

    public User getUser(String userID) {
        return users.getUser(userID);
    }

    public void addUser(User user) {
        users.addUser(user);
    }
}
