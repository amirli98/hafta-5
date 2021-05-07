package com.kodlamaio;

import com.kodlamaio.business.abstracts.UserService;
import com.kodlamaio.business.concretes.UserManager;
import com.kodlamaio.daos.concretes.ConcreteUserDao;
import com.kodlamaio.entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserManager(new ConcreteUserDao());
        userService.add(new User(1,"Fazil","Amirli","fazilfzamirli@gmail.com","1234"));
    }
}
