package layered.impl;

import layered.Dao;
import layered.Service;
import layered.User;

public class UserService implements Service<User> {

    private Dao dao;

    public UserService() {
        this.dao = new UserDao();
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }
}
