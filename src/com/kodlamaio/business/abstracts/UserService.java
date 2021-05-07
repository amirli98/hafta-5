package com.kodlamaio.business.abstracts;

import com.kodlamaio.entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAll();
}
