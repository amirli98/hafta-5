package com.kodlamaio.daos.abstracts;

import com.kodlamaio.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> getAllUsers();
    boolean exists(User user);
}
