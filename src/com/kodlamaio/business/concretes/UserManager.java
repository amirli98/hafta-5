package com.kodlamaio.business.concretes;

import com.kodlamaio.business.abstracts.UserService;
import com.kodlamaio.daos.abstracts.UserDao;
import com.kodlamaio.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserManager() {
    }

    @Override
    public void add(User user) {
        if(user.getId() == 12)
        {
            System.out.println(user.getFirstName()+" eklenemez");
            return;
        }
        userDao.add(user);
        System.out.println(user.getFirstName()+" eklendi.");
    }

    @Override
    public List<User> getAll() {
        return userDao.getAllUsers();
    }
}
